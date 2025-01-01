package com.ApiGateway.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ApiGateway.Entity.Users;
import com.ApiGateway.Service.SecurityService;

@RestController
public class JwtController {
	
	@Autowired
	public SecurityService securityService;
	
	
	@PostMapping("/login")
	public String login(@RequestBody Users user) {
		return securityService.verify(user);
	}

}
