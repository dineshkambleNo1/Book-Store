package com.bookStrore.BookStoreApp.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "bookShelf")
public class BookShelf {

    @Id
    private int id;
    private String name;
    private String author;
    private String price;

    public BookShelf() {
    }

    public BookShelf(int id, String name, String author, String price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


}
