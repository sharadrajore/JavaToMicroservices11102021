package com.zensar.services;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.zensar.entities.Student;

public interface StudentService {

	public Iterable<Student> getAllStudents(Pageable pageable);
	
	public Student getStudent(int studentId);
	
	public Student insertStudent( Student student);
	
	public void deleteStudent(int studentId) ;
	
	public Student updateStudent(int studentId,Student student);
	
	public List<Student> getAllStudentsByName(String studentName);
	
	public List<Student> getAllStudentsByNameAndAge(String studentName,int studentAge);
}
