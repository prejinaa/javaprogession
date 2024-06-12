package com.example.bookstore.repository;

import com.example.bookstore.entity.MyBookList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository

public interface MyBookRepository extends JpaRepository<MyBookList,Integer> {


}
