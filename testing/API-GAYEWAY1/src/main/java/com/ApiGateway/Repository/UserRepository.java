package com.ApiGateway.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.ApiGateway.Entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

	public Users findByUsername(String username);

}