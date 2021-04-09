package com.restcrud.restcrud.service;

import com.restcrud.restcrud.model.Book;
import com.restcrud.restcrud.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepo;

    public Book saveBook(Book bookModel) {
        return bookRepo.save(bookModel);
    }

    public Optional<Book> getBook(int id) {
        return bookRepo.findById(id);
    }

    public List<Book> getBooks() {
        return bookRepo.findAll();
    }

    public Book updateBook(Book book) {
        Book existingProduct = bookRepo.findById(book.getId()).orElse(null);
        existingProduct.setName(book.getName());
        existingProduct.setAuthor(book.getAuthor());
        return bookRepo.save(existingProduct);
    }

}
