package com.zensar.spring.cloud.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.spring.cloud.model.Product;
import com.zensar.spring.cloud.services.ProductService;

@RestController
@RequestMapping("/productapi")
public class ProductResource {
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/products/")
	public Product createProduct(@RequestBody Product product) {
		return productService.insertProduct(product);
	}

}
