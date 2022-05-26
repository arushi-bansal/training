package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@GetMapping("/hello")	
	public String sayHello()
		{
			return "Welcome to Spring Security";
		}
}
