package com.zensar.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.zensar.spring.beans.Employee;

@Configuration
public class DemoConfig {
	
	// <bean id="employee" class="com.zensar.spring.beans.Employee>"
	//	<property name="employeeId" value="1002">
	// </bean>
	@Bean
	public Employee employee() {
		
		Employee employee =new Employee();
		employee.setEmployeeId(1002);
		employee.setEmployeeName("Rajesh");
		employee.setEmployeeSalary(40000);
		
		return employee;
	}
	

}
