package com.dominiccaggese.springmvc.mvc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.dominiccaggese.springmvc.mvc.models.Book;
import com.dominiccaggese.springmvc.mvc.services.BookService;

@Controller
public class BooksController {
	
	@Autowired
	private BookService bookService;
	
	
	//show all books
	@GetMapping("/books")
	public String dashboard(Model model) {
		List<Book> bookList = bookService.allBooks();
		model.addAttribute("books", bookList);
		return "dashboard.jsp";
	}
	//show book
	@GetMapping("/books/{id}")
	public String showBook(@PathVariable("id")Long id, Model model) {
		Book foundBook = bookService.findBook(id);
		model.addAttribute("book", foundBook);
		return "show.jsp";
	}
}
