package com.mybank.companyservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.mybank.companyservice.entity.CompanyEntity;
import com.mybank.companyservice.repository.CompanyServiceRepository;

@Service
public class CompanyServiceDAO {
	
	@Autowired
	private CompanyServiceRepository repository;
	
	public CompanyEntity createCompany(CompanyEntity company) {
        return repository.save(company);
    }

	
	public CompanyEntity findCompanyBycompanyCEOID(String companyceoid) {
		return repository.findCompanyBycompanyCEOID(companyceoid);
	}
	
	public List<CompanyEntity> findCompanyBycompanyNameContaining(String companyName) {
		System.out.println("Here it comes..and this is the company name.." + companyName);
		return repository.findCompanyBycompanyNameContaining(companyName);
	}
}
