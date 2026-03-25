package com.example.BasicSecurity.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping("/")
	public String index() {
		return "homepage";
	}
	
	@GetMapping("/products/")
	public String indexP() {
		return "Sanpham";
	}
	
	@GetMapping("/admincp/")
	public String indexAd() {
		return "indexAdmin";
	}
	
	
	@GetMapping("/hello")
	public String hi() {
		return "hello";
	}
	
	@GetMapping("/login")
	public String getLogin() {
		return "login";
	}
}
