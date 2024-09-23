package com.mdtalalwasim.ecommercerest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminViewController {
	
	@GetMapping("/admin-dashboard")
	public String AdminPage() {
		
		return "/admin/admin-dashboard";
	}

}
