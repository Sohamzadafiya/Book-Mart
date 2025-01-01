package com.ApiGateway.SpringSecurityConfiguration.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.ApiGateway.SpringSecurityConfiguration.Entity.Users;
import com.ApiGateway.SpringSecurityConfiguration.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public Users getUserByUsername(String username) {
		return repository.findByUsername(username);
	}
	
	
}
