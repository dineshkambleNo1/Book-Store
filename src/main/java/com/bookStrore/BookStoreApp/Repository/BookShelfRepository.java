package com.bookStrore.BookStoreApp.Repository;

import com.bookStrore.BookStoreApp.Models.BookShelf;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookShelfRepository extends JpaRepository<BookShelf,Integer> {
}
