package com.zensar.spring.cloud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.spring.cloud.model.Product;
import com.zensar.spring.cloud.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product insertProduct(Product product) {
		return productRepository.save(product);
	}

}
