package com.zensar.spring.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.spring.spring_core.beans.Employee;
import com.zensar.spring.spring_core.beans.Product;

public class App {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		// ConfigurableApplicationContext context=new
		// ClassPathXmlApplicationContext("context.xml");

	//	Product product=(Product) context.getBean("myProduct1");
		
	//	Product product=context.getBean("myProduct1", Product.class);
		
		Employee employee=context.getBean("emp1",Employee.class);

		System.out.println(employee);

	}
}
