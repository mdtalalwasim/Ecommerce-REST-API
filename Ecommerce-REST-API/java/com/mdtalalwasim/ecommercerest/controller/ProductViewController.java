package com.mdtalalwasim.ecommercerest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class ProductViewController {

	@GetMapping("/all-products")
	public String showProductPage() {
		
		return "/product/all-product-home";
	}
	
	
}
