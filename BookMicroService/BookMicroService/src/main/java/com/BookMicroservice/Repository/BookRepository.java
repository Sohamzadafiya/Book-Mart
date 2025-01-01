package com.BookMicroservice.Repository;


import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.BookMicroservice.DTO.BookDTO;
import com.BookMicroservice.Entity.Books;

@Repository
public interface BookRepository extends JpaRepository<Books, Long>{

	List<Books> findBySellerId(Long sellerid);

}
