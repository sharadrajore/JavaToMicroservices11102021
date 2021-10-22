package com.zensar.spring.spring_core.beans;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Required;

import lombok.Data;

/*@Data
@Component(value = "emp1")
@Scope("prototype")
public class Employee {

	@Value("${empId}")
	private int employeeId;

	@Value("${empName}")
	private String employeeName;

	@Value("${empSal}")
	private int salary;
	
	@Autowired
	private Address address;   

}*/

public class Employee implements InitializingBean {

	private int employeeId;
	private String employeeName;
	private int salary;

	private Address address;

	public Employee() {
		
		super();
		System.out.println("Inside public Employee() ");
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public Employee(int employeeId, String employeeName, int salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	public Employee(int employeeId, String employeeName, int salary, Address address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.address = address;
	}

	public void setEmployeeId(int employeeId) {
		System.out.println("Inside public void setEmployeeId(int employeeId)");
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("public void afterPropertiesSet() throws Exception ");
		
	}
	
	
	public void myInit() {
		System.out.println("public void myInit()");
	}
	
	@PostConstruct
	public void mySpringInit() {
		System.out.println("public void mySpringInit()");
	}
	
	

}
