package com.mdtalalwasim.ecommercerest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegisterViewController {
	
	@GetMapping("/register")
	public String registerPage() {
		
		return "register";
	}
}
