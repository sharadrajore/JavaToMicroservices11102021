package com.zensar.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@Configuration
@ComponentScan(basePackages = {"test","com.zensar"})
@PropertySource(value = {"address.properties","myproperties.properties"})
public class DemoConfig {
	
	
	/*@Bean
	public Greeting greet() {
		
		GreetingImpl2 impl2=new GreetingImpl2();
		impl2.sayHello("Raj");
		return impl2;  
	}*/
	
	
	
	
	
	
	
	
	
	// <bean id="employee" class="com.zensar.spring.beans.Employee>"
	//	<property name="employeeId" value="1002">
	// </bean>
	/*@Bean(name = "emp1")
	public Employee getEmployee() {
		
	/*	Employee employee =new Employee();
		employee.setEmployeeId(1002);
		employee.setEmployeeName("Rajesh");
		employee.setEmployeeSalary(40000);  
		
		Employee employee=new Employee();
		//employee.setAddress(address());
		
		return employee;
	}*/
	
	
	/*@Bean(name = "addr")
	public Address getAddress() {
		return new Address("Maha","Pune",411016);
	} */
	

	
	

}
