package com.zensar.spring.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.zensar.spring.spring_core.beans.Employee;

public class App {
	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		
		Employee employee=context.getBean("emp1",Employee.class);
		
		System.out.println(employee);

	}
}
