package com.zensar.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.zensar.spring.beans.Product;
import com.zensar.spring.repository.ProductRepository;

@Service
public class ProductServiceImpl1 implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public void insertProduct(Product product) {
		productRepository.insertProduct(product);
		
	}

}
