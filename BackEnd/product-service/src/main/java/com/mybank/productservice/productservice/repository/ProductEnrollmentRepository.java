package com.mybank.productservice.productservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mybank.productservice.productservice.entity.ProductEnrollment;

public interface ProductEnrollmentRepository extends JpaRepository<ProductEnrollment, Integer>{

	List<ProductEnrollment> findBycompanyCEOId(String ceoId);
	
	List<ProductEnrollment> findByproductCd(String productCd);
	
	
	
}
