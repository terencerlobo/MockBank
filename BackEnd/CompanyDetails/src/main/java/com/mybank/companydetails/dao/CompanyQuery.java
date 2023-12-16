package com.mybank.companydetails.dao;

public class CompanyQuery {
	
	public final static String search_company = "Select company_id, company_name, city, zip_code, phone_number, is_large_scale "
			+ "from company_info where company_id = ?";
	
	public final static String create_company = "INSERT INTO company_info "
			+ "(company_id, company_name, created_by, created_date, updated_by, updated_date, city, zip_code, phone_number, is_large_scale, id) "
			+ "VALUES('', '', '', '', '', '', '', '', '', 0, (Select nextval('company_id_seq')))";

}
