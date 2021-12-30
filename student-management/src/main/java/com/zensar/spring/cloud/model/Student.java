package com.zensar.spring.cloud.model;

import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(description = "Student Model")
//@Entity
@Document(collection = "students")
public class Student {
	
	//@Id
	@ApiModelProperty(notes="Student Id ")
	private int studentId;
	
	@ApiModelProperty(notes="Student Name ")
	private String studentName;
	
	@ApiModelProperty(notes="Student Age ")
	private int studentAge;
	
	

	public Student() {
		super();
	}

	public Student(int studentId, String studentName, int studentAge) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAge = studentAge;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge + "]";
	}
	
	
	
}
