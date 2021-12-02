package com.zensar.spring.cloud.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coupon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String code;
	private BigDecimal discount;
	private String expDate;
	
	
	public Coupon() {
		super();
	}

	public Coupon(long id, String code, BigDecimal discount, String expDate) {
		super();
		this.id = id;
		this.code = code;
		this.discount = discount;
		this.expDate = expDate;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public BigDecimal getDiscount() {
		return discount;
	}
	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	@Override
	public String toString() {
		return "Coupon [id=" + id + ", code=" + code + ", discount=" + discount + ", expDate=" + expDate + "]";
	}
	
	
	
	
	

}
