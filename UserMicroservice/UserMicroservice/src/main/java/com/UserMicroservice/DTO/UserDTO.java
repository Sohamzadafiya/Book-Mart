package com.UserMicroservice.DTO;

import java.util.List;

public class UserDTO {
	
	
	private long id;
	private String username;
	private String password;
	private String contact;
	private String email;
	private String address;
	private List<BookDTO> books;
	
	
	public UserDTO() {
		super();
	}
	
	public UserDTO(long id, String username, String password, String contact, String email, String address) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.contact = contact;
		this.email = email;
		this.address = address;
	}
	
	public UserDTO(String username, String password, String contact, String email, String address) {
		super();
		this.username = username;
		this.password = password;
		this.contact = contact;
		this.email = email;
		this.address = address;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public List<BookDTO> getBooks() {
		return books;
	}

	public void setBooks(List<BookDTO> books) {
		this.books = books;
	}
	

}
