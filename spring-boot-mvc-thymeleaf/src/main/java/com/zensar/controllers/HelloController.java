package com.zensar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.zensar.entity.Student;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
	public String sayHello(Model model) {
		Student student=new Student();
		student.setStudentId(100);
		student.setStudentName("Sharad");
		student.setStudentAge(32);
		model.addAttribute("student", student);
		return "hello";
	}

}
