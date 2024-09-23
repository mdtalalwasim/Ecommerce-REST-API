package com.mdtalalwasim.ecommercerest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class CategoryViewController {
	
	@GetMapping("/category")
	public String addProductPage() {
		
		return "/admin/category/category-home";
	}
	
	@GetMapping("/add-category")
	public String addCategory() {
		
		return "/admin/category/category-add-form";
	}
}
