package com.mybank.companydetails.model;

public class CompanyDetailsResponse {
	
	private String ceoId;
	private String companyName;
	private boolean isLargeScale;
	private String city;
	private String zipCode;
	private String phoneNumber;
	
	public String getCeoId() {
		return ceoId;
	}
	public void setCeoId(String ceoId) {
		this.ceoId = ceoId;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public boolean isLargeScale() {
		return isLargeScale;
	}
	public void setLargeScale(boolean isLargeScale) {
		this.isLargeScale = isLargeScale;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String toString() {
		return this.getCeoId() + ", " + this.getCompanyName();
	}
	
}
