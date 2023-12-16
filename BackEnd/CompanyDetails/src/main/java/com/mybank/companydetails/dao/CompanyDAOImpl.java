package com.mybank.companydetails.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mybank.companydetails.model.CompanyDetailsResponse;


@Repository
public class CompanyDAOImpl implements CompanyDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<CompanyDetailsResponse> searchCompany(String ceoID) {
		
		List<CompanyDetailsResponse> companyDetailsRsp = new ArrayList<>();
		//company_id, company_name, city, zip_code, phone_number, is_large_scale 
		
		jdbcTemplate.query(CompanyQuery.search_company, (ResultSet rs) ->{
			CompanyDetailsResponse rsp = new CompanyDetailsResponse();
			rsp.setCeoId(rs.getString(1));
			rsp.setCompanyName(rs.getString(2));
			rsp.setLargeScale(("1".equals(rs.getString(6))) ? true: false);
			rsp.setPhoneNumber(rs.getString(5));
			rsp.setZipCode(rs.getString(4));
			companyDetailsRsp.add(rsp);
		}, ceoID);
        
       
        
		return companyDetailsRsp;
	}

	@Override
	public void createCompany(CompanyDetailsResponse companyDetails) {
		// TODO Auto-generated method stub
		
	}
	

}
