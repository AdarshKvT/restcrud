package com.restcrud.restcrud.controller;

import com.restcrud.restcrud.model.Book;
import com.restcrud.restcrud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @PostMapping("/add-book")
    public Book addBook(@RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @PostMapping("/add-books")
    public List<Book> addBooks(@RequestBody List<Book> books) {
        return bookService.saveBooks(books);
    }

    @GetMapping("/get-book/{id}")
    public Optional<Book> getBook(@PathVariable int id) {
        return bookService.getBook(id);
    }

    @GetMapping("/get-books")
    public List<Book> findAllBooks() {
        return bookService.getBooks();
    }

    @PutMapping("update-book")
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id) {
        return bookService.deleteBook(id);
    }
}
