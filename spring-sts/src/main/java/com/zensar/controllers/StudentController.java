package com.zensar.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entities.Student;
import com.zensar.services.StudentService;

@RestController("studController")
@RequestMapping(produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE })
public class StudentController {

	// CRUD -> Create,Read,Updated,Delete

	// List<Student> students=Arrays.asList(new Student(1,"Virat",35),new
	// Student(2,"Rohit",37),new Student(3,"KL",33));
	// List<Student> students=new ArrayList<Student>();
	// http://localhsot:8080/students/ -> GET

	@Autowired
	private StudentService studentService;

	// @RequestMapping(value = "/students", method = { RequestMethod.GET })
	@GetMapping("/students")
	public Iterable<Student> getAllStudents() {
		return studentService.getAllStudents();
		// return studentService.getAllStudents(PageRequest.of(0,
		// 3,Direction.DESC,"studentName") );
	}

	// http://localhsot:8080/students/20000 -> GET
	// @RequestMapping(value = "/students/{studentId}", method = RequestMethod.GET)
	@GetMapping("/students/{studentId}")
	public Student getStudent(@PathVariable(value = "studentId") int studentId) {
		return studentService.getStudent(studentId);
	}

	// @RequestMapping(value="/students/name/{studentName}",
	// method=RequestMethod.GET)
	@GetMapping("/students/name/{studentName}")
	public List<Student> getStudentByItsName(@PathVariable("studentName") String studentName) {
		return studentService.getAllStudentsByName(studentName);

	}

	// getAllStudentsByNameAndAge
	// @RequestMapping(value="/students/name/{studentName}/{studentAge}",
	// method=RequestMethod.GET)
	@GetMapping("/students/name/{studentName}/{studentAge}")
	public List<Student> getStudentByItsNameAndAge(@PathVariable("studentName") String studentName,
			@PathVariable("studentAge") int studentAge) {
		return studentService.getAllStudentsByNameAndAge(studentName, studentAge);

	}

	// http://localhost:8080/students -> POST
	// @RequestMapping(value = "/students", method = RequestMethod.POST)
	@PostMapping("/students")
	public Student insertStudent(@RequestBody Student student) {
		System.out.println(student);
		return studentService.insertStudent(student);
	}

	// http://localhost:8080/students -> DELETE
	// @RequestMapping(value = "/students/{studentId}", method =
	// RequestMethod.DELETE)
	@DeleteMapping("/students/{studentId}")
	public void deleteStudent(@PathVariable("studentId") int studentId) {
		studentService.deleteStudent(studentId);

	}

	// http://localhost:8080/students/1 -> PUT,PATCH
	// @RequestMapping(value = "/students/{studentId}", method = RequestMethod.PUT)
	@PutMapping("/students/{studentId}")
	public Student updateStudent(@PathVariable("studentId") int studentId, @RequestBody Student student) {
		return studentService.updateStudent(studentId, student);
	}

}
