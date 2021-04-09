package com.restcrud.restcrud.repository;

import com.restcrud.restcrud.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
