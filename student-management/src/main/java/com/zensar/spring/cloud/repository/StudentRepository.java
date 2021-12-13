package com.zensar.spring.cloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.spring.cloud.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
