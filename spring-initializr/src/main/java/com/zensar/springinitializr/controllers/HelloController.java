package com.zensar.springinitializr.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	// http://localhost:8080/hello
	@RequestMapping("/")
	public String sayHello() {
		return "<h3> Welcome to Spring Boot !!!!</h3>";
	}

}
