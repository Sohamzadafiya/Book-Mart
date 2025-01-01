package com.UserMicroservice.repository;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.UserMicroservice.DTO.BookDTO;

@FeignClient(name="BookMicroService")
public interface BookClientRepository {

	
	@GetMapping("/books/sellerid/{sellerid}")
	public List<BookDTO> getBySellerId(@PathVariable Long sellerid);
	
}


