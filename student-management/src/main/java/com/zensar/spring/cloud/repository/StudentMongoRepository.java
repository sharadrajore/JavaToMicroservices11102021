package com.zensar.spring.cloud.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.zensar.spring.cloud.model.Student;

@Repository
public interface StudentMongoRepository extends MongoRepository<Student, Integer> {
		List<Student> findByStudentName(String name);
}
