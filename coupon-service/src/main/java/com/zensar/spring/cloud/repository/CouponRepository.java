package com.zensar.spring.cloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zensar.spring.cloud.model.Coupon;

public interface CouponRepository extends JpaRepository<Coupon, Long> {
	
	public Coupon findByCode(String couponCode);
}
