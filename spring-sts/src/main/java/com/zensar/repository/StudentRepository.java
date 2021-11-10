package com.zensar.repository;

import java.util.List;

import com.zensar.entities.Student;

public interface StudentRepository {

	public List<Student> getAllStudents();

	public Student getStudent(int studentId);

	public boolean insertStudent(Student student);

	public void deleteStudent(int studentId);

	public Student updateStudent(int studentId, Student student);

}
