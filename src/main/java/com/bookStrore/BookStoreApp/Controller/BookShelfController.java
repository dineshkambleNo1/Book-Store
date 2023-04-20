package com.bookStrore.BookStoreApp.Controller;

import com.bookStrore.BookStoreApp.Models.BookShelf;
import com.bookStrore.BookStoreApp.Service.BookShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookShelfController {

    @Autowired
    BookShelfService bookShelfService;

    @RequestMapping("/deleteMyList/{id}")
    public String deleteMylist(@PathVariable("id") int id){
        bookShelfService.deleteBookById(id);
        return "redirect:/book_shelf";
    }
}
