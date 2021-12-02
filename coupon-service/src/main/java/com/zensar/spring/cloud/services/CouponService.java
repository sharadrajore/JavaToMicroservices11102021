package com.zensar.spring.cloud.services;

import com.zensar.spring.cloud.model.Coupon;

public interface CouponService {

	Coupon insertCoupon(Coupon coupon);

	Coupon getCoupon(String couponName);

}
