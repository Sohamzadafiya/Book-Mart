package com.ApiGateway.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.ApiGateway.Entity.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

	Users findByUsername(String username);

}