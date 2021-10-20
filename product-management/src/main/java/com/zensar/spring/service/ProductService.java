package com.zensar.spring.service;

import org.springframework.beans.factory.annotation.Qualifier;

import com.zensar.spring.beans.Product;

public interface ProductService {
	
	public void insertProduct(Product product);
}
