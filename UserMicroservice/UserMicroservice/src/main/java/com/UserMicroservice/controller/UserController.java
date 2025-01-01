package com.UserMicroservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.UserMicroservice.DTO.UserDTO;
import com.UserMicroservice.Entity.Users;
import com.UserMicroservice.service.UserService;



@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	public UserService userService;
	
		
	@GetMapping("")
	public List<UserDTO> getAll() {
		return userService.getAllUser();
	}
	
	@GetMapping("/{id}")
	public UserDTO getById(@PathVariable("id") Long id) {
		return userService.getById(id);
	}
	
	@PostMapping("/adduser")
	public UserDTO addUser(@RequestBody UserDTO userdto) {
		return userService.addUser(userdto);
	}
	
	@PostMapping("/updateuser")
	public UserDTO updateUser(@RequestBody UserDTO userdto) {
		return userService.update(userdto);
	}
	
	
	
	

}
