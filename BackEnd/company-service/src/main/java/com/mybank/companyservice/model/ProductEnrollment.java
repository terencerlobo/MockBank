package com.mybank.companyservice.model;

public class ProductEnrollment {
	
	private int id;
	
	private String productCd;
	private String companyCEOId;
	private String enrollmentAction;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
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
