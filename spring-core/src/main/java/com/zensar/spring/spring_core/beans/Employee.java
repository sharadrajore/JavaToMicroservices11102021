package com.zensar.spring.spring_core.beans;

import java.util.Properties;
import java.util.Set;

import lombok.Data;

@Data
public class Employee {

	private int employeeId;

	private Set<String> employeeName;

	private int salary;
	
	private Properties address;


	

}
