package com.zensar.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.zensar.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>{

	//public List<Student> findByStudentName(String studentName);
	
	//@Query(value = "SELECT s FROM Student s WHERE s.studentName = ?1")
	@Query(value = "select * from student where name=?1",nativeQuery = true)
	List<Student> test(String studentName);
	
	//@Query(value = "SELECT s FROM Student s WHERE s.studentName = ?1 and s.studentAge = ?2")
	//@Query(value="SELECT * FROM student s WHERE s.name = ?1 and s.age = ?2",nativeQuery=true)
	//public List<Student> nameAndAge(String name,int age);
	
	@Query(value="SELECT * FROM student s WHERE s.name = :myname and s.age = :myage",nativeQuery=true)
	public List<Student> nameAndAge(@Param("myname")String name,@Param("myage")int age);
	
	
	
	
}
