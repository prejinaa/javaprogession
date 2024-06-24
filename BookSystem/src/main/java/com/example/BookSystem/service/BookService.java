package com.example.BookSystem.service;

import com.example.BookSystem.dto.BookDto;

import java.util.List;

public interface BookService {
    BookDto CreateBook(BookDto bookDto);
    List<BookDto> getAllBook();
    BookDto getBookById(Long id);
    BookDto updateBook(Long id,BookDto bookDto);
    void DeleteBook(Long Id);

}
