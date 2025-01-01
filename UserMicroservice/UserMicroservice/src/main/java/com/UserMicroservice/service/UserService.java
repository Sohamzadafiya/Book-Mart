package com.UserMicroservice.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UserMicroservice.DTO.UserDTO;
import com.UserMicroservice.Entity.Users;
import com.UserMicroservice.repository.BookClientRepository;
import com.UserMicroservice.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	@Autowired
	private BookClientRepository bookClientRepository;
	
	
//	User --> UserDTO Method
	public Users DTOToEntity(UserDTO userDTO) {
		return new Users(userDTO.getId(),
						userDTO.getUsername(),
						userDTO.getPassword(),
						userDTO.getContact(),
						userDTO.getEmail(),
						userDTO.getAddress());
	}
	
//	UserDTO --> User Method
	
	public UserDTO EntityToDTO(Users user) {
		return new UserDTO(user.getId(),
						   	user.getUsername(),
							user.getPassword(),
							user.getContact(),
							user.getEmail(),
							user.getAddress());
	}
	
	
	
	public List<UserDTO> getAllUser(){
		
		List<UserDTO> userdto = repository.findAll().stream().map(user -> EntityToDTO(user)).collect(Collectors.toList());
		for(UserDTO dto : userdto) {
			dto.setBooks(bookClientRepository.getBySellerId(dto.getId()));
		}
		
		return userdto;
	}
	
	
	public UserDTO getById(Long id) {
		
		Optional<Users> user = repository.findById(id);
		if(user.isPresent()) {
			return EntityToDTO(user.get());
		}
		return null;
	}
	
	public UserDTO addUser(UserDTO userdto) {
		Users user = DTOToEntity(userdto);
		return EntityToDTO(repository.save(user));
	}
	
	
	public UserDTO update(UserDTO userdto) {
		
		Optional<Users> useroptional = repository.findById(userdto.getId());
		if(useroptional.isPresent()) {
			Users user = useroptional.get();
			
			user.setUsername(userdto.getUsername());
			user.setPassword(userdto.getPassword());
			user.setContact(userdto.getContact());
			user.setEmail(userdto.getEmail());
			user.setAddress(userdto.getAddress());
			
			return EntityToDTO(repository.save(user));
		}
		
		return userdto;
	}
	

}
