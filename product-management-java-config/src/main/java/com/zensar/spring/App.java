package com.zensar.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zensar.spring.beans.Product;
import com.zensar.spring.config.AppConfig;
import com.zensar.spring.controllers.ProductController;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductController productController1 = context.getBean("productController", ProductController.class);

		productController1.insertProduct(new Product());

		System.out.println(productController1.hashCode());

	}
}
