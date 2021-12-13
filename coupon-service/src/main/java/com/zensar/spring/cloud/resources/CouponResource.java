package com.zensar.spring.cloud.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.spring.cloud.model.Coupon;
import com.zensar.spring.cloud.services.CouponService;

@RestController
@RequestMapping("/couponapi/")
public class CouponResource {
	
	@Value("${spring.server.name}")
	private String name;

	@Autowired
	private CouponService couponService;

	// http://localhost:8080/couponapi/coupons
	@PostMapping("/coupons")
	public Coupon createCoupon(@RequestBody Coupon coupon) {
		return couponService.insertCoupon(coupon);
	}

	@GetMapping("/coupons/{couponCode}")
	public Coupon getCoupon(@PathVariable("couponCode")String couponCode) {
		System.out.println("Response from  "+name);
		return couponService.getCoupon(couponCode);
	}

}
