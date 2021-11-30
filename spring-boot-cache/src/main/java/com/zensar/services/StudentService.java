package com.zensar.services;

import com.zensar.entity.Student;

public interface StudentService {
	
	public Student getStudent(int studentId);

	public Student insertStudent(Student student);

}
