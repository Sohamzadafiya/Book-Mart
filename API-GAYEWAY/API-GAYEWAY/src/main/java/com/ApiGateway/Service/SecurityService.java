package com.ApiGateway.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.ApiGateway.Entity.Users;

@Service
public class SecurityService {

	@Autowired
	public AuthenticationManager authManager;
	
	@Autowired
	public JwtService jwtService;
	
	public String verify(Users user) {
		Authentication authentication = authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword())); 
		
		System.out.println(user.getUsername() + authentication.isAuthenticated());
		if(authentication.isAuthenticated()) {
			return jwtService.generateToken(user.getUsername());
		}
		else {
			return "wrong username or password";
		}
	}
	
}
