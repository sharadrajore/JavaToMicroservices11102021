package com.zensar.spring.spring_core.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;




@Data
@Component(value = "emp1")
public class Employee {

	@Value("${empId}")
	private int employeeId;

	@Value("${empName}")
	private String employeeName;

	@Value("${empSal}")
	private int salary;
	
	@Autowired
	private Address address;   

}
