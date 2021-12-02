package com.zensar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	// http://localhost:8080/hello
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}

}
