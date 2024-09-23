package com.mdtalalwasim.ecommercerest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class ProductViewController {

	@GetMapping("/all-products")
	public String showProductPage() {
		
		return "/admin/product/all-product-home";
	}
	
	@GetMapping("/add-product")
	public String addProductPage() {
		
		return "/admin/product/add-product";
	}
	
	
}
