package com.example.BookSystem.controller;


import com.example.BookSystem.dto.BookDto;
import com.example.BookSystem.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


// it capable of handling HTTP requests and returning responses in JSON format.
@RestController
//This annotation specifies that the controller will handle requests starting with /api/books
@RequestMapping(value= "/api/books")

public class BookController {
    @Autowired //this annotation injects an instance of BookService into the controller
    private BookServiceImpl bookService;

    @PostMapping
    public BookDto createBook(@RequestBody BookDto bookDto){
         return bookService.CreateBook(bookDto);

    }
    @GetMapping
    public List<BookDto> getAllBook(){
        return bookService.getAllBook();
    }
    @GetMapping("/{id}")

    public  BookDto getBookById(@PathVariable Long id){
        return bookService.getBookById(id);
    }
    @PutMapping("/{id}")
    public BookDto updateBook(@PathVariable Long id,@RequestBody BookDto bookDto){
        return bookService.updateBook(id, bookDto);
    }
    @DeleteMapping("/{id}")
    public void DeleteBook(@PathVariable Long id){
        bookService.DeleteBook(id);
    }

}

