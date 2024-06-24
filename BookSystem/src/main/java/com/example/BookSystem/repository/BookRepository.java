package com.example.BookSystem.repository;

import com.example.BookSystem.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface BookRepository extends JpaRepository<Book,Long> {
}
