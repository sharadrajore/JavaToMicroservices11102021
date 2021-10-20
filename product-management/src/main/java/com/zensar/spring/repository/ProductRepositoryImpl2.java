package com.zensar.spring.repository;

import org.springframework.stereotype.Repository;

import com.zensar.spring.beans.Product;


public class ProductRepositoryImpl2 implements ProductRepository {
	
	Product[] products=new Product[10];

	public void insertProduct(Product product) {
		System.out.println("Product Inserted !!!");
		products[0]=product;
		
	}

}
