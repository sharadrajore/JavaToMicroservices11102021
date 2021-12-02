package com.zensar.spring.cloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.spring.cloud.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
