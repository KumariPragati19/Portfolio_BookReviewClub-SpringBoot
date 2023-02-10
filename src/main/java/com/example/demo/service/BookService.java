package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;

import com.example.demo.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bRepo;
	
	public void save(Book b) {
		bRepo.save(b);
		
	}
	
	public List<Book> getAllBook(){
		return  (List<Book>) bRepo.findAll();
	}

	public Book getBookById(int id) {
		Optional<Book> optional = bRepo.findById(id);
		Book book = null;
		if (optional.isPresent()) {
			book = optional.get();
		} else {
			throw new RuntimeException("book not found" + id);
		}
		return book;
		
	}	

	
//	public Object find(int id) {
//		// TODO Auto-generated method stub
//		return  bRepo.findById(id);
//	}

	
	

	
}
