package com.mdtalalwasim.ecommercerest.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class CategoryViewController {
	
	@Value("${base.url}")
    private String baseurl;
	
	@GetMapping("/category")
	public String addProductPage(Model model) {
		model.addAttribute("baseurl", baseurl);
		
		return "/admin/category/category-home";
	}
	
	@GetMapping("/add-category")
	public String addCategory(Model model) {
		System.out.println("URL :"+baseurl);
		model.addAttribute("baseurl", baseurl);
		return "/admin/category/category-add-form";
	}
}
