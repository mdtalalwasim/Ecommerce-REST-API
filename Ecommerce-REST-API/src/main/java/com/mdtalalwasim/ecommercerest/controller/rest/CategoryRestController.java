package com.mdtalalwasim.ecommercerest.controller.rest;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.mdtalalwasim.ecommercerest.entity.Category;
import com.mdtalalwasim.ecommercerest.service.CategoryService;

@RestController
@RequestMapping("/api")
public class CategoryRestController {
	
	@Autowired
	CategoryService categoryService;

	@PostMapping("/save-category")
	ResponseEntity<?> saveCategory(@RequestParam("categoryName") String categoryName,
			@RequestParam("isActive") Boolean isActive,
			@RequestParam(value = "file", required = false) MultipartFile file) {
		
		try {
			System.out.println("INSIDE");
			// Create Category object
            Category category = new Category();
            category.setCategoryName(categoryName);
            category.setIsActive(isActive);
            
            //for file handling
            String imageName = file !=null ? file.getOriginalFilename() : "default.jpg";
    		category.setCategoryImage(imageName);
    		
    		File saveFile = new ClassPathResource("static/img").getFile();
			Path path = Paths.get(saveFile.getAbsolutePath()+File.separator+"category"+File.separator+file.getOriginalFilename());
			System.out.println("File save Path :"+path);
			
			Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
			//set Suceesss Msg to Session
			//session.setAttribute("successMsg", "Category Save Successfully.");
            System.out.println("Category going to save: "+category.toString());
			categoryService.saveCategory(category);
			
			return ResponseEntity.status(HttpStatus.OK).body("Category is created successfully.");
			
		} catch (Exception e) {
			//e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error saving category: " + e.getMessage());
		}
		
		
	}

}
