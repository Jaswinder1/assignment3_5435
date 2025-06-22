package com.library.assignment2.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


public class Book {

    @Id
    private int book_Id;
    private String author;
    private String title;
    private double price;
    private boolean available;

    // No-arg constructor
    public Book() {
    }

    // All-args constructor
    public Book(int book_Id, String author, String title, double price, boolean available) {
        this.book_Id = book_Id;
        this.author = author;
        this.title = title;
        this.price = price;
        this.available = available;
    }

    // Getters
    public int getBook_Id() {
        return book_Id;
    }

    public void setBook_Id(int book_Id) {
        this.book_Id = book_Id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    // toString
    @Override
    public String toString() {
        return "Book [book_Id=" + book_Id + ", author='" + author + "', title='" + title + 
               "', price=" + price + ", available=" + available + "]";
    }
}
