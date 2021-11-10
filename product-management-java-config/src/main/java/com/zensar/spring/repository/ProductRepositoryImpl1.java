package com.zensar.spring.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.zensar.spring.beans.Product;

@Repository
public class ProductRepositoryImpl1 implements ProductRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	// C,R->All R->productId,U -> update,D -> Delete
	
	public void insertProduct(Product product) {
		jdbcTemplate.update("insert into product values (1,'HDD',4500);");
		
	}

}
