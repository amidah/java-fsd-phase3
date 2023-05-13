package com.simplilearn.springbootcrudoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.springbootcrudoperation.model.Books;
import com.simplilearn.springbootcrudoperation.service.BooksService;

@RestController
public class BooksController {
	
	@Autowired
	BooksService booksService;
	
	//C - Create Operation - POST
	//R - Read Operation   - GET
	//U - Update Operation - PUT
	//D - Delete Operation - DELETE
	
	// Read - GET Operation
	@GetMapping("/book")
	private List<Books> getAllBooks(){
		return booksService.getAllBooks();
	}
	
	// Read - GET Operation for single book
	@GetMapping("/book/{bookid}")
	private Books getBooks(@PathVariable("bookid") int bookId) {
		return booksService.getBooksById(bookId);
	}
	
	// Create - POST Operation
	@PostMapping("/books")
	private int saveBook(@RequestBody Books books) {
		booksService.saveORUpdate(books);
		return books.getBookId();
	}

	// Update - PUT Operation
	@PutMapping("/books")
	private Books update(@RequestBody Books books) {
		booksService.saveORUpdate(books);
		return books;
	}
	
	// Delete operation
	@DeleteMapping("/book/{bookid}")  
	private void deleteBook(@PathVariable("bookid") int bookid)   
	{  
	booksService.delete(bookid);  
	}  
	
}
