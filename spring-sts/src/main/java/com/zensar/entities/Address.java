package com.zensar.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Address implements Serializable {

	@Id
	private int id;
	
	private int pinCode;
	
	private String state;
	
	private String city;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Student student;

	public Address(int id, int pinCode, String state, String city, Student student) {
		super();
		this.id = id;
		this.pinCode = pinCode;
		this.state = state;
		this.city = city;
		this.student = student;
	}

	public Address() {
		super();
	}
	
	
	
	
	
	
}
