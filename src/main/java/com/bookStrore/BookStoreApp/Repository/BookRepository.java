package com.bookStrore.BookStoreApp.Repository;

import com.bookStrore.BookStoreApp.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}