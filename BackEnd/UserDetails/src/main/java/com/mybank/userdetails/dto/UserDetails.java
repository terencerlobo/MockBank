package com.mybank.userdetails.dto;

import jakarta.validation.constraints.Email;

public class UserDetails {
	
	private String userId;
	private String pwd;
	
	@Email
	private String email;
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
