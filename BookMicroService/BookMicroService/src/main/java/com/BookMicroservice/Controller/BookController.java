package com.BookMicroservice.Controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.BookMicroservice.DTO.BookDTO;
import com.BookMicroservice.Entity.Books;
import com.BookMicroservice.Repository.BookRepository;
import com.BookMicroservice.Service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

	
	@Autowired
	private BookService bookService;
	
	
	@GetMapping("")
	public List<BookDTO> getAllBooks(){
    	return bookService.getAllBooks();
    }
	
	
	@GetMapping("/{bookid}")
    public BookDTO findById(@PathVariable Long bookid) {
    	return bookService.findById(bookid);
    }
	
	@GetMapping("/sellerid/{sellerid}")
	public List<BookDTO> getMethodName(@PathVariable Long sellerid) {
		return bookService.findBySellerId(sellerid);
	}
	
    
    
    @PostMapping("/addbook")
    public BookDTO save(@RequestBody BookDTO bookdto) {
    	return bookService.save(bookdto);
    }
	
	
}
