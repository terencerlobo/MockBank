package com.mybank.companyservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class CompanyEntity {
	
	@Id
	@SequenceGenerator (
			name = "company_sequence",
			sequenceName = "company_sequence",
			allocationSize = 1
	)
	@GeneratedValue (
			strategy = GenerationType.SEQUENCE,
			generator = "company_sequence"
	)
	private int companyID;
	private String companyCEOID;
	private String companyName;
	private String status;
	private String companyCounty;
	
	public int getCompanyID() {
		return companyID;
	}
	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}
	public String getCompanyCEOID() {
		return companyCEOID;
	}
	public void setCompanyCEOID(String companyCEOID) {
		this.companyCEOID = companyCEOID;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyCounty() {
		return companyCounty;
	}
	public void setCompanyCounty(String companyCounty) {
		this.companyCounty = companyCounty;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
