package com.mybank.companyservice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mybank.companyservice.entity.CompanyEntity;


@Repository
public interface CompanyServiceRepository extends JpaRepository<CompanyEntity, Integer>{
	
	CompanyEntity findCompanyBycompanyCEOID(String ceoID);
	
	List<CompanyEntity> findCompanyBycompanyNameContaining(String companyName);
	
}
