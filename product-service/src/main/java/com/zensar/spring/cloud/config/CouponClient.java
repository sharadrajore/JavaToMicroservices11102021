package com.zensar.spring.cloud.config;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.zensar.spring.cloud.model.Coupon;

@FeignClient("GATEWAY-SERVICE")
public interface CouponClient {
	
	@GetMapping("/couponapi/coupons/{couponCode}")
	Coupon getCoupon(@PathVariable("couponCode")String couponCode);

}
