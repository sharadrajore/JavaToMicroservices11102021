package com.zensar.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.zensar.spring.beans.Product;
import com.zensar.spring.service.ProductService;

//@Component
@Controller
public class ProductController {
	
	@Autowired
	@Qualifier("productServiceImpl1")
	private ProductService productService;
	
	public void insertProduct(Product product) {
		productService.insertProduct(product);
	}

}
