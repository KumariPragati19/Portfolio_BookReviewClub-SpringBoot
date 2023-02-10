package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import com.example.demo.entity.Book;
import com.example.demo.service.BookService;



@Controller
public class BookController {
	
	@Autowired
	private BookService service;
	
//	@Autowired
//	private ReviewService reviewService;
	
	
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	@GetMapping("/books_club")
	public String BookClub() {
		return "redirect:/home";
	}
	
	
	@GetMapping("/books_add")
	public String NewbookReview() {
		return "NewBookReview";
	}
	
	@GetMapping("/available_book")
	public ModelAndView getAllBook() {
		java.util.List<Book> list=service.getAllBook();
		return new ModelAndView("bookList","book",list);
	}
	
	@PostMapping("/save")
	public String addBook(@ModelAttribute Book b) {
		service.save(b);
		return "redirect:/available_book";
	}
	
	@GetMapping("/showReviewOfBook/{id}")
	public String showReviewOfBook(@PathVariable ( value = "id") int id, Model model) {
		Book book = service.getBookById(id);
		model.addAttribute("book", book);
		return "reviewBook";
	}
	
	
	
}
