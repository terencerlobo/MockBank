package com.kafka.kafka.data;

public class ProductDetails {
	
	private String productCd;
	private int productId;
	private String productStatus;
	private String entitlement;
	private String billingAccountNumber;
	private String billingRtn;
	private String billingStartDate;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getProductCd() {
		return productCd;
	}
	public void setProductCd(String productCd) {
		this.productCd = productCd;
	}
	
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	
	public String getBillingAccountNumber() {
		return billingAccountNumber;
	}
	public void setBillingAccountNumber(String billingAccountNumber) {
		this.billingAccountNumber = billingAccountNumber;
	}
	
	public String getEntitlement() {
		return entitlement;
	}
	public void setEntitlement(String entitlement) {
		this.entitlement = entitlement;
	}
	
	public String getBillingStartDate() {
		return billingStartDate;
	}
	public void setBillingStartDate(String billingStartDate) {
		this.billingStartDate = billingStartDate;
	}
	
	public String getBillingRtn() {
		return billingRtn;
	}
	public void setBillingRtn(String billingRtn) {
		this.billingRtn = billingRtn;
	}
	
	
	

}
