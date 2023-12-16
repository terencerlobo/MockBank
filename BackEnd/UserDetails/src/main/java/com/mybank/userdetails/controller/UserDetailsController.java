package com.mybank.userdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mybank.userdetails.dto.UserDetails;
import com.mybank.userdetails.dto.UserDetailsResponse;
import com.mybank.userdetails.service.UserDetailsService;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
public class UserDetailsController {
	
	@Autowired
	 private UserDetailsService userDetailsService;

	 
	@PostMapping("/authenticateUser")
    public ResponseEntity<UserDetailsResponse> authenticateUser(@RequestBody UserDetails loginDetails) {
		System.out.println("This is the pwd.. " + loginDetails.getPwd());
		System.out.println("Hrer it comes..");
		boolean isAuthenticated = userDetailsService.authenticateUser(loginDetails.getUserId(), loginDetails.getPwd());

		
		if (isAuthenticated) {
			UserDetailsResponse rsp = new UserDetailsResponse();
			rsp.setMessage("Authentication successful");
			rsp.setSuccess(true);
            return ResponseEntity.ok(rsp);
        } else {
        	UserDetailsResponse rsp = new UserDetailsResponse();
			rsp.setMessage("Authentication failure");
			rsp.setSuccess(false);
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(rsp);
        }
    }

	
	@GetMapping("/getUser")
    public ResponseEntity<UserDetailsResponse> getUser() {
		System.out.println("Here it comes..");

		
		UserDetailsResponse rsp = new UserDetailsResponse();
		rsp.setMessage("Authentication successful. Enjoy Darling!! Thank god, it works!!");
		rsp.setSuccess(true);
        return ResponseEntity.ok(rsp);
    }
	
	
	@PostMapping("/createUser")
    public ResponseEntity<String> createUser(@Validated @RequestBody UserDetails loginDetails) {
		
		boolean isAuthenticated = userDetailsService.createUser(loginDetails);

		
		if (isAuthenticated) {
            return ResponseEntity.ok("Authentication successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Authentication failed");
        }
    }
	
	
}
