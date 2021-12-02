package com.zensar.spring.cloud.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.spring.cloud.model.Coupon;
import com.zensar.spring.cloud.repository.CouponRepository;

@Service
public class CouponServiceImpl implements CouponService {

	@Autowired
	private CouponRepository couponRepository;

	@Override
	public Coupon insertCoupon(Coupon coupon) {
		return couponRepository.save(coupon);
	}

	@Override
	public Coupon getCoupon(String couponCode) {
		return couponRepository.findByCode(couponCode);
	}

}
