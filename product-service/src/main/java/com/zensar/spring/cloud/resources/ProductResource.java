package com.zensar.spring.cloud.resources;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zensar.spring.cloud.model.Coupon;
import com.zensar.spring.cloud.model.Product;
import com.zensar.spring.cloud.services.ProductService;

@RestController
@RequestMapping("/productapi")
public class ProductResource {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/products/")
	public Product createProduct(@RequestBody Product product) {
		//RestTemplate restTemplate=new RestTemplate();
		
		// http://localhost:8080/couponapi/coupons/COOL50
		
		//Coupon coupon=restTemplate.getForObject("http://localhost:8083/couponapi/coupons/"+product.getCouponCode(), Coupon.class);
		
		Coupon coupon=restTemplate.getForObject("http://COUPON-SERVICE/couponapi/coupons/"+product.getCouponCode(), Coupon.class);
		
		
		BigDecimal productCost= product.getPrice().subtract(coupon.getDiscount());
		product.setPrice(productCost);
		return productService.insertProduct(product);
	}

}
