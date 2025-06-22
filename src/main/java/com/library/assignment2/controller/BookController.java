package com.library.assignment2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import com.library.assignment2.service.BookService;

import com.library.assignment2.model.*;


@RestController
@RequestMapping("/book")
public class BookController{
	private final BookService bookService;
	  @Autowired
	    public BookController(BookService bookService) {
	        this.bookService = bookService;
	    }
	//for testing purpose
//	@RequestMapping(value = "/book", method = RequestMethod.GET)
//	public Book getBook() {
//		Book book=new Book();
//		book.setBook_Id(108);
//		book.setAuthor("JK Rowling");
//		book.setTitle("Harry Potter");
//		book.setPrice(99.99);
//		book.setAvailable(true);
//		return book;
//		
//
//		
//	}
	  @GetMapping
	    public Flux<Book> getAllBooks() {
	        return bookService.getAll();
	    }
	   @GetMapping("/{id}")
	    public Mono<Book> getBookById(@PathVariable String id) {
	        return bookService.getById(id);
	   }
	   @PostMapping
	   public Mono<Book> saveBook(@RequestBody Book book) {
	       return bookService.save(book);
	   }

}