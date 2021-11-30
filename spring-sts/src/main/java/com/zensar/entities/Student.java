package com.zensar.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



//@NamedQuery(name = "Student.test", query = "SELECT s FROM Student s WHERE s.studentName = ?1")
//@NamedQuery(name = "Student.nameAndAge", 
//			query = "SELECT s FROM Student s WHERE s.studentName = ?1 and s.studentAge = ?2")



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@NamedQueries(value = {  
//		@NamedQuery(name = "Student.nameAndAge", 
//		query = "SELECT s FROM Student s WHERE s.studentName = ?1 and s.studentAge = ?2") })


// @NamedNativeQuery(name = "Student.test", query = "select * from student where name=?1",resultClass = Student.class)
//@NamedNativeQuery(name = "Student.nameAndAge", query = "select * from student where name=?1 and age=?2",resultClass = Student.class)


//@NamedNativeQueries(value = { @NamedNativeQuery(name = "Student.test", query = "select * from student where name=?1",resultClass = Student.class),
//		@NamedNativeQuery(name = "Student.nameAndAge", query = "select * from student where name=?1 and age=?2",resultClass = Student.class)
//})
public class Student implements Serializable {  
	
	
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "Id" )
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	@Column(name = "Name",length = 100)
	private String studentName;
	@Column(name = "Age")
	private int studentAge;
	
	@OneToMany(mappedBy = "student" ,cascade = CascadeType.ALL)
	//@JoinTable(name = "stud_addr", joinColumns = @JoinColumn(name="sid"),inverseJoinColumns =  @JoinColumn(name="aid"))
	private List<Address> addresss;
	
	public Student(int id,String name,int age) {
		this.studentId=id;
		this.studentName=name;
		this.studentAge=age;
	}
	   

}
