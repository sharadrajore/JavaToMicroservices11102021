package com.zensar.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.entities.Student;
import com.zensar.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	//List<Student> students=new ArrayList<Student>();
	// http://localhsot:8080/students/  -> GET
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	
	public List<Student> getAllStudents(){
		return studentRepository.getAllStudents();
	}
	

	public Student getStudent(int studentId) {
		return studentRepository.getStudent(studentId);
	
	}
	
	
	
	public boolean insertStudent( Student student) {
		return studentRepository.insertStudent(student);
	}
	
	
	
	public void deleteStudent(int studentId) {
		
	}
	
	
	
	public Student updateStudent(int studentId,Student student) {
		return null;
	}
	
}
