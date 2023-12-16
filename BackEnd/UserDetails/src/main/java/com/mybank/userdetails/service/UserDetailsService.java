package com.mybank.userdetails.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mybank.userdetails.dto.UserDetails;
import com.mybank.userdetails.repo.UserDetailsDAO;

@Component
public class UserDetailsService {
	
	@Autowired
	private UserDetailsDAO userDetailsDAO;
	
	
	public boolean authenticateUser(String userId, String pwd) {
		boolean userAuthenticated = false;
		
		
		userAuthenticated = userDetailsDAO.authenticate(userId, pwd);
		
		
		return userAuthenticated;
	}
	
	
	public boolean createUser(UserDetails userDetails) {
		boolean userCreated = false;
		
		
		userCreated = userDetailsDAO.insertUser(userDetails);
		
		
		return userCreated;
	}

}
