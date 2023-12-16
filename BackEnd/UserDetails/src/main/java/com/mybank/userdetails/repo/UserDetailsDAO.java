package com.mybank.userdetails.repo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.mybank.userdetails.dto.SamplePojo;
import com.mybank.userdetails.dto.UserDetails;

@Service
public class UserDetailsDAO {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	
	SamplePojo sp;
			
    public boolean authenticate(String userId, String pwd) {
        String query = "SELECT COUNT(*) FROM user_details WHERE user_id = ? AND pwd = ?";
        int count = jdbcTemplate.queryForObject(query, Integer.class, userId, pwd);
        
        
        
        return count > 0; // Authentication is successful if a matching user is found
        
    }
    
    public boolean insertUser(UserDetails userDetails) {
    	String query = "Insert into user_details (user_id, email, pwd, created_on, last_login) values (?, ?, ?, ?, ?)";
    	System.out.println("This is the query.. ==> " + query);
    	int count = jdbcTemplate.update(query, userDetails.getUserId(), userDetails.getEmail(), userDetails.getPwd(), new Date(), new Date());
    	
    	
    	return count > 0;
    }
}

