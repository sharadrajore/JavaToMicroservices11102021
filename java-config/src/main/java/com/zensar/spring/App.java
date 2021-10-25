package com.zensar.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.zensar.spring.beans.Employee;
import com.zensar.spring.config.DemoConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(DemoConfig.class);
    	
    	Employee employee=context.getBean("employee", Employee.class);
    	
    	System.out.println(employee);
    }
}
