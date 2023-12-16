package com.mybank.companydetails.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybank.companydetails.dao.CompanyDAOImpl;
import com.mybank.companydetails.model.CompanyDetailsResponse;

@Service
public class CompanyDetailsService {
	
	@Autowired
	private CompanyDAOImpl companyDAO;
	
	
	public List<CompanyDetailsResponse> searchCompany(String ceoID) {
		
		List<CompanyDetailsResponse> companyDetails = new ArrayList<>();
		companyDetails = companyDAO.searchCompany(ceoID);
		
		return companyDetails;
	}
	
	
	public boolean createCompany(CompanyDetailsResponse userDetails) {
		boolean userCreated = false;
		
		return userCreated;
	}

}
