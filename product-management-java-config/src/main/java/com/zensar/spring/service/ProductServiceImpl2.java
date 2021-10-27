package com.zensar.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.zensar.spring.beans.Product;
import com.zensar.spring.repository.ProductRepository;

@Service
public class ProductServiceImpl2 implements ProductService {

	@Autowired
	@Qualifier("productRepositoryImpl2")
	private ProductRepository productRepository;
	
	public void insertProduct(Product product) {
		productRepository.insertProduct(product);
		
	}

}
