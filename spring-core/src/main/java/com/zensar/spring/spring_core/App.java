package com.zensar.spring.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

		// ConfigurableApplicationContext context=new
		// ClassPathXmlApplicationContext("context.xml");

		// Product product=(Product) context.getBean("myProduct1");

		// System.out.println(product.getProductName());

	}
}
