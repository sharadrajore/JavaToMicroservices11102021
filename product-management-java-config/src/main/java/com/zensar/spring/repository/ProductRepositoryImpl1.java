package com.zensar.spring.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.spring.beans.Product;

@Repository
public class ProductRepositoryImpl1 implements ProductRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	
	
	public void insertProduct(Product product) {
		jdbcTemplate.update("insert into product values (1,'Ram',10000);");
		
	}

}
