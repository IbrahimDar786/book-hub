package com.springproject.book_hub.repository;




import org.springframework.data.jpa.repository.JpaRepository;

import com.springproject.book_hub.entity.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByTitleContainingIgnoreCase(String title);

    List<Book> findByAuthorContainingIgnoreCase(String author);
}
