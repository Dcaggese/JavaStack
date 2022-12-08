package com.dominiccaggese.springmvc.mvc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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
	// render add book form
	@GetMapping("/books/new")
	public String renderAddBook(@ModelAttribute("book") Book book) {
		return "addBook.jsp";
	}
	
	//POST new book to database from form
	@PostMapping("/books/new")
	public String addBook(
			@Valid @ModelAttribute("book")Book book,
			BindingResult result ) {
		if (result.hasErrors()) {
			return "addBook.jsp";
		}
		bookService.createBook(book);
		return "redirect:/books";
	}
}
