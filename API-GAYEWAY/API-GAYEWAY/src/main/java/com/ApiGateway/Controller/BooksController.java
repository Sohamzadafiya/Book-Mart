package com.ApiGateway.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ApiGateway.Repository.BookClientRepository;

@RestController
public class BooksController {
	
	@Autowired(required = true)
	public BookClientRepository bookClientRepository;
	
	
	@GetMapping("/books")
	public ResponseEntity<?> getbooks(){
		return ResponseEntity.ok(bookClientRepository.getAllBooks());
	}
	
	@GetMapping("/books/sellerid/{sellerid}")
	public ResponseEntity<?> getBooksBySellerId(@PathVariable Long sellerid){
		return ResponseEntity.ok(bookClientRepository.getBySellerId(sellerid));
	}
	
	@GetMapping("/books/{bookid}")
	public ResponseEntity<?> getByBookId(@PathVariable Long bookid){
		return ResponseEntity.ok(bookClientRepository.getByBookId(bookid));
	}
	

}
