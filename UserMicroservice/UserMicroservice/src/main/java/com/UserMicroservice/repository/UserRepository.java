package com.UserMicroservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UserMicroservice.Entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
