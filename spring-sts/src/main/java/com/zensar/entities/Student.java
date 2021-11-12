package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Generated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
	
	@Id
	@Column(name = "Id" )
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	@Column(name = "Name",length = 100)
	private String studentName;
	@Column(name = "Age")
	private int studentAge;
	
	

}
