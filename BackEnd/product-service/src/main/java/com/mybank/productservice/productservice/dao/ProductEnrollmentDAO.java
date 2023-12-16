package com.mybank.productservice.productservice.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mybank.productservice.productservice.entity.ProductEnrollment;
import com.mybank.productservice.productservice.repository.ProductEnrollmentRepository;

@Service
public class ProductEnrollmentDAO {
	
	@Autowired
	private ProductEnrollmentRepository repository;
	
	public ProductEnrollment saveProductEnrollment(ProductEnrollment productEnrollment) {
		return repository.save(productEnrollment);
	}
	
	public List<ProductEnrollment> findByproductCd(String productCd){
		return repository.findByproductCd(productCd);
	}
	
	public List<ProductEnrollment> findBycompanyCEOId(String ceoId){
		return repository.findBycompanyCEOId(ceoId);
	}

}
