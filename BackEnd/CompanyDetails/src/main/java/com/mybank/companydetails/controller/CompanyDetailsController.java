package com.mybank.companydetails.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mybank.companydetails.model.CompanyDetailsRequest;
import com.mybank.companydetails.model.CompanyDetailsResponse;
import com.mybank.companydetails.service.CompanyDetailsService;

@RestController
@Validated
public class CompanyDetailsController {
	
	@Autowired
	 private CompanyDetailsService companyDetailsService;

	 
	@PostMapping("/searchCompany")
    public ResponseEntity<List<CompanyDetailsResponse>> searchCompany(@RequestBody CompanyDetailsRequest companyDetailsRequest) {
		
		List<CompanyDetailsResponse> companyDetailsRsp = companyDetailsService.searchCompany(companyDetailsRequest.getCeoID());
		
		return ResponseEntity.status(HttpStatus.OK).body(companyDetailsRsp);
    }

	
	
	@PostMapping("/createUser")
    public ResponseEntity<String> createUser(@Validated @RequestBody CompanyDetailsResponse loginDetails) {
		return ResponseEntity.ok("Authentication successful");
	}
	
	
}
