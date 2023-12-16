package com.mybank.companyservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.mybank.companyservice.client.ProductEnrollmentClient;
import com.mybank.companyservice.dao.CompanyServiceDAO;
import com.mybank.companyservice.entity.CompanyEntity;
import com.mybank.companyservice.model.ProductEnrollment;

@RestController
@RequestMapping("/company-service")
public class CompanyServiceController {
	
	
	 @Autowired
	 private CompanyServiceDAO companyDao;
	 
	 @Autowired
	 private ProductEnrollmentClient productEnrollmentClient;

	 @PostMapping("/createCompany")
	 public CompanyEntity createCompany(@RequestBody CompanyEntity company) {
		 return companyDao.createCompany(company);
	 }
	 
	 @GetMapping("/getCompanyById/{ceoId}")
	 public CompanyEntity getCompanyById(@PathVariable("ceoId") String ceoId) {
		 return companyDao.findCompanyBycompanyCEOID(ceoId);
	 }
	 
	 @GetMapping("/getCompaniesByName")
	 public List<CompanyEntity> getCompaniesByName(@RequestParam("companyName") String companyName) {
		 return companyDao.findCompanyBycompanyNameContaining(companyName);
	 }

	 @GetMapping("/findBycompanyCEOId")
	 public List<ProductEnrollment> findProductByCeoID(@RequestParam("ceoId") String ceoId){
		return productEnrollmentClient.findBycompanyCEOId(ceoId);
	 }
	 
	 
}
