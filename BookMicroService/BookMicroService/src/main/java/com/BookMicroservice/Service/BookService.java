package com.BookMicroservice.Service;


import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.BookMicroservice.DTO.BookDTO;
import com.BookMicroservice.Entity.Books;
import com.BookMicroservice.Repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	
	// Convert DTO to Entity
    public Books toEntity(BookDTO bookDTO) {
        return new Books(
                
                bookDTO.getTitle(),
                bookDTO.getCategory(),
                bookDTO.getPrice(),
                bookDTO.getCondition(),
                bookDTO.getSellerId(),
                bookDTO.getLanguage());
    }

    // Convert Entity to DTO
    public static BookDTO toDTO(Books book) {
        return new BookDTO(
            book.getId(),
            book.getTitle(),
            book.getCategory(),
            book.getPrice(),
            book.getCondition(),
            book.getSellerId(),
            book.getLanguage()
        );
    }
    
    
    public List<BookDTO> getAllBooks(){
    	return bookRepository.findAll().stream().map(b -> toDTO(b)).collect(Collectors.toList());
    }
    
    
    public BookDTO findById(Long bookid) {
    	Optional<Books> book = bookRepository.findById(bookid);
    	if(book.isPresent()) {
    		return toDTO(book.get());
    	}
    	return null;
    }
    
    
    public BookDTO save(BookDTO bookdto) {
    	return toDTO(bookRepository.save(toEntity(bookdto)));
    }

	public List<BookDTO> findBySellerId(Long sellerid) {
		
		List<Books> books = bookRepository.findBySellerId(sellerid);
		List<BookDTO> bookdto = books.stream().map(b -> toDTO(b)).collect(Collectors.toList());
		
		return bookdto;
	}    

}
