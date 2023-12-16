package com.mybank.companyservice.client;

import java.util.List;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import com.mybank.companyservice.model.ProductEnrollment;

@HttpExchange
public interface ProductEnrollmentClient {
	
	@GetExchange("/findBycompanyCEOId")
	public List<ProductEnrollment> findBycompanyCEOId(@RequestParam("ceoId") String ceoId);

}
