package com.bookStrore.BookStoreApp.Service;

import com.bookStrore.BookStoreApp.Models.Book;
import com.bookStrore.BookStoreApp.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    public void save(Book b){
        bookRepository.save(b);
    }

    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    
    public Book getBookById(int id){
        return bookRepository.findById(id).get();
    }

    public void deleteBookById(int id){
         bookRepository.deleteById(id);
    }
}
