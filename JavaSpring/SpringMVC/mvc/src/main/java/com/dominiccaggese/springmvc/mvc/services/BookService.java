package com.dominiccaggese.springmvc.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dominiccaggese.springmvc.mvc.models.Book;
import com.dominiccaggese.springmvc.mvc.respositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepository;
	
	//Constructor
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	// returns all the books
	public List<Book> allBooks() {
		return bookRepository.findAll();
	}

	// creates a book
	public Book createBook(Book title) {
		return bookRepository.save(title);
	}

	// retrieves a book
	public Book findBook(Long id) {
		Optional<Book> optionalBook = bookRepository.findById(id);
		if (optionalBook.isPresent()) {
			return optionalBook.get();
		} else {
			return null;
		}
	}
	//updates book
	public Book updateBook(Book id) {
		return bookRepository.save(id);
	}
	
	//Delete book
	public void deleteBook(Long id) {
		bookRepository.deleteById(id);
	}
}
