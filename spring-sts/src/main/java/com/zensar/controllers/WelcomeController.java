package com.zensar.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	// http://localhost:8080/welcome
	
	@RequestMapping("/welcome")
	public String welcome() {
		return "<h2> Hi ,Spring Boot </h2>";
	}
	
	

}
