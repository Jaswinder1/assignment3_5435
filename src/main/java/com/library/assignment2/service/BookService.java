package com.library.assignment2.service;

import com.library.assignment2.model.Book;
import com.library.assignment2.interface2.BookInterface;

import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service

public class BookService {

    private final BookInterface bookInterface;
    public BookService(BookInterface bookInterface) {
        this.bookInterface = bookInterface;
    }

    // ✅ Get All Books
    public Flux<Book> getAll() {
        return bookInterface.findAll();
    }

    // ✅ Get Book by ID
    public Mono<Book> getById(final String id) {
        return bookInterface.findById(id);
    }
 // ✅ Save Book
    public Mono<Book> save(final Book book) {
        return bookInterface.save(book);
    }

}
