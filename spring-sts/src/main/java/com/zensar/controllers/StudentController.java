package com.zensar.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.Student;
import com.zensar.services.StudentService;

@RestController
@RequestMapping(produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
public class StudentController {

	// CRUD -> Create,Read,Updated,Delete

	// List<Student> students=Arrays.asList(new Student(1,"Virat",35),new
	// Student(2,"Rohit",37),new Student(3,"KL",33));
	// List<Student> students=new ArrayList<Student>();
	// http://localhsot:8080/students/ -> GET

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/students", method = { RequestMethod.GET })
	public Iterable<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	// http://localhsot:8080/students/20000 -> GET
	@RequestMapping(value = "/students/{studentId}", method = RequestMethod.GET)
	public Student getStudent(@PathVariable(value = "studentId") int studentId) {
		return studentService.getStudent(studentId);

	}

	// http://localhost:8080/students -> POST
	@RequestMapping(value = "/students", method = RequestMethod.POST)
	public Student insertStudent(@RequestBody Student student) {
		return studentService.insertStudent(student);
	}

	// http://localhost:8080/students -> DELETE
	@RequestMapping(value = "/students/{studentId}", method = RequestMethod.DELETE)
	public void deleteStudent(@PathVariable("studentId") int studentId) {
		studentService.deleteStudent(studentId);

	}

	// http://localhost:8080/students/1 -> PUT,PATCH
	@RequestMapping(value = "/students/{studentId}", method = RequestMethod.PUT)
	public Student updateStudent(@PathVariable("studentId") int studentId, @RequestBody Student student) {
		return studentService.updateStudent(studentId, student);
	}

}
