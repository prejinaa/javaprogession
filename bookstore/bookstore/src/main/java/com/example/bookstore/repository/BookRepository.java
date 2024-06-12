package com.example.bookstore.repository;

import com.example.bookstore.entity.Book;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;



public interface BookRepository extends JpaRepository<Book,Integer> {
    @Modifying
    @Transactional
    @Query(value = "TRUNCATE TABLE book", nativeQuery = true)
    void truncateTable();
}
