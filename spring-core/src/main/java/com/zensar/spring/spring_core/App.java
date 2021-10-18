package com.zensar.spring.spring_core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.zensar.spring.spring_core.beans.Employee;

public class App {
	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");

	//	 ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		
		ApplicationContext context = new FileSystemXmlApplicationContext("context.xml");
		
		

	//	Product product=(Product) context.getBean("myProduct1");
		
	//	Product product=context.getBean("myProduct1", Product.class);
		
	//	Resource resource= new FileSystemResource("context.xml");
	//	BeanFactory beanFactory=new XmlBeanFactory(resource);
		
		//Employee employee1=context.getBean("emp1",Employee.class);
		
		System.out.println(context.getBeansOfType(Employee.class));
		
	//	Employee employee2=beanFactory.getBean("emp1",Employee.class);
		
		
		//Address address=context.getBean("addr",Address.class);

	//	System.out.println(employee1);
		
	//	System.out.println(employee2);
		
		

	}
}
