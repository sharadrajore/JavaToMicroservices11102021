package com.zensar.spring.spring_core.beans;

public class Employee {
	
	private int employeeId;
	
	private String employeeName;
	
	private int salary;
	
	private Address address;
	

	

	public Employee() {
		super();
	}


	
	

	public Employee(int employeeId, String employeeName, int salary) {
		super();
		System.out.println("Inside public Employee(int employeeId, String employeeName, int salary)1");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	
	public Employee(int employeeId,String employeeName,String salary) {
		System.out.println("Inside public Employee(String employeeId,String employeeName,String salary)2");
	}

	public Employee(int employeeId, String employeeName, int salary, Address address) {
		super();
		System.out.println("Inside public Employee(int employeeId, String employeeName, int salary, Address address)3");
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.address = address;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		System.out.println("Inside public void setEmployeeId(int employeeId) ");
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


	
	
	

}
