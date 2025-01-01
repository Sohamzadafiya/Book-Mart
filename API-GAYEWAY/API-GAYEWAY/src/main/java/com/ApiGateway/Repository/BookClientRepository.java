package com.ApiGateway.Repository;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name="BookMicroService")
public interface BookClientRepository {

	
	@GetMapping("/books/sellerid/{sellerid}")
	public ResponseEntity<?> getBySellerId(@PathVariable Long sellerid);
	
	@GetMapping("/books")
	public ResponseEntity<?> getAllBooks();
	
	@GetMapping("/books/{bookid}")
	public ResponseEntity<?> getByBookId(@PathVariable Long bookid);
	
}

