package com.ApiGateway.Service;

import java.net.Authenticator;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import com.ApiGateway.Entity.Users;
import com.ApiGateway.Repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public Users getUserByUsername(String username) {
		return repository.findByUsername(username);
	}
	
}
