package com.ApiGateway.SpringSecurityConfiguration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.ApiGateway.SpringSecurityConfiguration.Entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
	
	public Users findByUsername(String username);

}
