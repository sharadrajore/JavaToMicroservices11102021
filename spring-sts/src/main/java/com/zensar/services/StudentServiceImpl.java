package com.zensar.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.zensar.entities.Student;
import com.zensar.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	// List<Student> students=new ArrayList<Student>();
	// http://localhsot:8080/students/ -> GET

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	public Student getStudent(int studentId) {
		// return studentRepository.findOne(studentId); // 1.5.4
		return studentRepository.findById(studentId).get(); // 2.5.6
	}

	public Student insertStudent(Student student) {
		return studentRepository.save(student);
	}

	public void deleteStudent(int studentId) {
		// studentRepository.delete(studentId); //1.5.4.RELEASE
		studentRepository.deleteById(studentId); // 2.5.6
	}

	public Student updateStudent(int studentId, Student student) {
		Student s1 = getStudent(studentId);
		return studentRepository.save(s1);
	}

	@Override
	public List<Student> getAllStudentsByName(String studentName) {
		return studentRepository.test(studentName);
	}

	// getByStudentNameAndStudentAge
	public List<Student> getAllStudentsByNameAndAge(String studentName, int studentAge) {
		return studentRepository.nameAndAge(studentName, studentAge);
	}

	/*
	 * public Page<Student> getAllStudents(Pageable pageable){ return
	 * studentRepository.findAll(pageable); }
	 */

}
