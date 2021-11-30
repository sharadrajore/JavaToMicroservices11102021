package com.zensar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.zensar.controllers.StudentController;
import com.zensar.entities.Address;
import com.zensar.entities.Student;
import com.zensar.repository.AddressRepository;

@SpringBootApplication
public class SpringStsApplication implements CommandLineRunner {
	
	@Autowired
	StudentController controller;
	
	@Autowired
	AddressRepository addressRepository;

	public static void main(String[] args) throws Exception {
		
		
		 SpringApplication.run(SpringStsApplication.class, args);
		 
		
		 
		
		 
		 
		
		
	//	ConfigurableApplicationContext context = SpringApplication.run(SpringStsApplication.class, args);

	/*	StudentController controller = (StudentController) context.getBean("studController"); // ID,NAME

		Student student = new Student();
		student.setStudentId(100);
		student.setStudentName("Raja");
		student.setStudentAge(28);

		Student insertStudent = controller.insertStudent(student);

		if (insertStudent != null) {
			System.out.println("Student inserted with student Id   " + insertStudent.getStudentId());
		}
		
		controller.deleteStudent(100);  */
		 
		
		

	}

	@Override
	public void run(String... args) throws Exception {
		 Student student=new Student(1,"Ram",28);
		 addressRepository.save(new Address(1,411016,"Maha","Pune",student));
		 addressRepository.save(new Address(2,411046,"Maha","Pune",student));
		
	}

	/*@Override
	public void run(ApplicationArguments args) throws Exception {
		controller.insertStudent(new Student(200,"Rani",32));
		controller.insertStudent(new Student(201,"Ravi",34));
	}*/

	/*@Override
	public   void run(String... args) throws Exception {
		System.out.println(args);
		System.out.println(controller);
		controller.insertStudent(new Student(20,"Rani",32));
		controller.insertStudent(new Student(21,"Ravi",34));
		
	}*/

}
