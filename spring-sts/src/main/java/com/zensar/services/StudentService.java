package com.zensar.services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.entities.Student;

public interface StudentService {

	public List<Student> getAllStudents();
	
	public Student getStudent(int studentId);
	
	public boolean insertStudent( Student student);
	
	public void deleteStudent(int studentId) ;
	
	public Student updateStudent(int studentId,Student student);
}
