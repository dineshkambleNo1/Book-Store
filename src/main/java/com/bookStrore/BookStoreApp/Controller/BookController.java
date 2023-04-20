package com.bookStrore.BookStoreApp.Controller;

import com.bookStrore.BookStoreApp.Models.Book;
import com.bookStrore.BookStoreApp.Models.BookShelf;
import com.bookStrore.BookStoreApp.Service.BookService;
import com.bookStrore.BookStoreApp.Service.BookShelfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private BookShelfService bookShelfService;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/book_register")
    public String bookRegister(){
        return "bookregister";
    }

    @GetMapping("/available_books")
    public ModelAndView availableBooks(){
        List<Book> list = bookService.getAllBooks();
        return new ModelAndView("available_books","book",list);
    }

    @GetMapping("/book_shelf")
    public String bookShelf(Model model){
        List<BookShelf> list = bookShelfService.getAllBooks();
        model.addAttribute("book",list);
        return "book_shelf";
    }

    @PostMapping("/save")
    public String addBook(@ModelAttribute Book b){
        bookService.save(b);
        return "redirect:/available_books";
    }

    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") int id){
        Book b = bookService.getBookById(id);
        BookShelf bs = new BookShelf(b.getId(),b.getName(),b.getAuthor(),b.getPrice());
        bookShelfService.saveBooks(bs);
        return "redirect:/book_shelf";
    }

    @RequestMapping("/editMyBook/{id}")
    public String editMyBook(@PathVariable("id") int id,Model model){
       Book b  =  bookService.getBookById(id);
       model.addAttribute("book",b);
        return "bookEdit";
    }

    @RequestMapping("/deleteMyBook/{id}")
    public String deleteBookById(@PathVariable("id") int id){
        bookService.deleteBookById(id);
        return "redirect:/available_books";
    }
}
