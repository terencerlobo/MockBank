package com.mybank.companydetails.dao;

import java.util.List;

import com.mybank.companydetails.model.CompanyDetailsResponse;

public interface CompanyDAO {
	
	public List<CompanyDetailsResponse> searchCompany(String ceoID);
	
	public default List<CompanyDetailsResponse> searchCompany(int ceoID) {
		return null;
	}
	
	public void createCompany(CompanyDetailsResponse companyDetails);

}
