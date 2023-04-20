package com.bookStrore.BookStoreApp.Service;

import com.bookStrore.BookStoreApp.Models.BookShelf;
import com.bookStrore.BookStoreApp.Repository.BookShelfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookShelfService {

    @Autowired
    private BookShelfRepository bookShelfRepository;

    public void saveBooks(BookShelf b){
        bookShelfRepository.save(b);
    }

    public List<BookShelf> getAllBooks(){
        return bookShelfRepository.findAll();
    }

    public void deleteBookById(int id){
        bookShelfRepository.deleteById(id);
    }
}
