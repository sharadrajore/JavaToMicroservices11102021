package com.zensar.spring.cloud.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.spring.cloud.model.Student;
import com.zensar.spring.cloud.repository.StudentRepository;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api")
public class StudentResource {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return studentRepository.findAll();
	}
	
	
	@GetMapping("/students/{studentId}")
	@ApiOperation(value = "Find Student By Id", notes = "Provide an id to look up specific Student form Student Resource")
	public Student getStudent(@ApiParam(value = "Id of the student",required = true)@PathVariable("studentId")int studentId) {
		return studentRepository.findById(studentId).get();
	}
	
	@PostMapping("/students")
	public Student insertStudent(@RequestBody Student student) {
		return studentRepository.save(student);
	}
	
	

}
