package com.zensar.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.entity.Student;
import com.zensar.exceptions.StudentNotFoundException;
import com.zensar.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	private StudentRepository repository;
	

	@Override
	public Student getStudent(int studentId) {
		return repository.findById(studentId).orElse(null);

	}


	@Override
	public Student insertStudent(Student student) {
		return repository.save(student);
	}

}
