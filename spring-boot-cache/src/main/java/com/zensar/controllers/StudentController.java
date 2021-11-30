package com.zensar.controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entity.Student;
import com.zensar.services.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;

	@GetMapping("/students/{studentId}")
	//@Transactional(readOnly=true)
	//@Cacheable("student-cache")
	public Student getStudent(@PathVariable("studentId") int studentId) {
		return service.getStudent(studentId);
	}
	
	
	@PostMapping("/students")
	public ResponseEntity<String> insertStudent(@RequestBody Student student) {
		service.insertStudent(student);
		return new  ResponseEntity(HttpStatus.CREATED);
	}
}
