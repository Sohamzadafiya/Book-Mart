package com.ApiGateway.SpringSecurityConfiguration;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ApiGateway.SpringSecurityConfiguration.Entity.UserPrincipal;
import com.ApiGateway.SpringSecurityConfiguration.Entity.Users;
import com.ApiGateway.SpringSecurityConfiguration.Service.UserService;


@Service
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserService userService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Users user = userService.getUserByUsername(username);
		System.out.println(user);
		
		if(user == null) {
			System.out.println("USer Not Found");
			throw new UsernameNotFoundException("User Not Found");
		}
		
		return new UserPrincipal(user);
	}

}
