package com.zensar.repository;

import org.springframework.data.repository.CrudRepository;

import com.zensar.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
