package com.zensar.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.zensar.entities.Student;

@Repository
public class StudentRepositoryImpl implements StudentRepository {

	List<Student> students=new ArrayList<Student>();
	// http://localhsot:8080/students/  -> GET
	
	
	public StudentRepositoryImpl() {
		students.add(new Student(1,"Virat",35));
		students.add(new Student(2,"Rohit",37));
		students.add(new Student(3,"KL",33));
	}

	public List<Student> getAllStudents(){
		return students;
	}
	

	public Student getStudent(int studentId) {
		for(Student student:students) {
			if(student.getStudentId()==studentId) {
				return student;
			}
		}
		return null;
	}
	
	
	
	public boolean insertStudent( Student student) {
		return students.add(student);
	}
	
	
	
	public void deleteStudent(int studentId) {
		
	}
	
	
	
	public Student updateStudent(int studentId,Student student) {
		return null;
	}

}
