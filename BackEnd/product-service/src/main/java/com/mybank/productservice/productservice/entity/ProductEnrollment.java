package com.mybank.productservice.productservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_enrollment")
public class ProductEnrollment {
	
	@Id
	@SequenceGenerator(
			name = "product_enrollment_sequence",
			sequenceName = "product_enrollment_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			generator = "product_enrollment_sequence",
			strategy = GenerationType.SEQUENCE
			)
	private int id;
	
	private String productCd;
	private String companyCEOId;
	private String enrollmentAction;
	
	public String getProductCd() {
		return productCd;
	}
	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}
	
	public String getCompanyCEOId() {
		return companyCEOId;
	}
	public void setCompanyCEOId(String companyCEOId) {
		this.companyCEOId = companyCEOId;
	}
	
	public String getEnrollmentAction() {
		return enrollmentAction;
	}
	public void setEnrollmentAction(String enrollmentAction) {
		this.enrollmentAction = enrollmentAction;
	}
	
	

}
