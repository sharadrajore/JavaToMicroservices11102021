package com.zensar.spring.cloud.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.zensar.spring.cloud.model.Coupon;
import com.zensar.spring.cloud.model.Product;
import com.zensar.spring.cloud.services.ProductService;

@RestController
@RequestMapping("/productapi")
public class ProductResource {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	//@LoadBalanced
	private RestTemplate restTemplate;
	
	@Autowired
	private EurekaClient client;
	
	//@Autowired
	//private DiscoveryClient client;
	
	@PostMapping("/products/")
	public Product createProduct(@RequestBody Product product) {
		
		
	//	List<ServiceInstance> instances = client.getInstances("COUPON-SERVICE");
		
	//	String url=instances.get(0).getUri().toString();
		
	//	System.out.println(url);
		
		InstanceInfo instance = client.getNextServerFromEureka("COUPON-SERVICE", false);
		
	
		
		String url=instance.getHomePageUrl();
		
		System.out.println(url);
		
		ResponseEntity<Coupon> coupon = restTemplate.exchange(url+"/couponapi/coupons/"+product.getCouponCode(), HttpMethod.GET, null, Coupon.class);
		
		Coupon coupon1= coupon.getBody();
		
		product.setPrice(product.getPrice().subtract(coupon1.getDiscount()));
		
		
		
		return productService.insertProduct(product);
		
		//RestTemplate restTemplate=new RestTemplate();
		
		// http://localhost:8080/couponapi/coupons/COOL50
		
		//Coupon coupon=restTemplate.getForObject("http://localhost:8083/couponapi/coupons/"+product.getCouponCode(), Coupon.class);
		
	//	Coupon coupon=restTemplate.getForObject("http://COUPON-SERVICE/couponapi/coupons/"+product.getCouponCode(), Coupon.class);
		
		
		//BigDecimal productCost= product.getPrice().subtract(coupon.getDiscount());
	//	product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
		//product.setPrice(productCost);
	//	return productService.insertProduct(product);
	}

}
