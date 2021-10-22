package com.zensar.spring.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.spring_core.beans.Employee;

public class App {
	public static void main(String[] args) {
	
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		
		
		Employee employee1=(Employee)context.getBean("emp1");
		Employee employee2=(Employee)context.getBean("emp1");
		
		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
		
	

	}
}
