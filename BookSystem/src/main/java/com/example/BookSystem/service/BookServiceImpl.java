package com.example.BookSystem.service;


import com.example.BookSystem.dto.BookDto;
import com.example.BookSystem.entity.Book;
import com.example.BookSystem.exception.ResourceNotFoundException;
import com.example.BookSystem.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;
@Service

//all the public logic is done here
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;
    @Override
    public BookDto CreateBook(BookDto bookDto) {
        Book book=new Book();
        book.setTitle(bookDto.getTitle());
        book.setAuthor(bookDto.getAuthor());
        book.setIsbn(bookDto.getIsbn());
        book=bookRepository.save(book);
        return convertTODto(book);

    }



    @Override
    public List<BookDto> getAllBook() {
           List<Book>books=bookRepository.findAll();
           return books.stream().map(this::convertTODto).collect(Collectors.toList());

    }

    @Override
    public BookDto getBookById(Long id) {
        Book Book=bookRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("Book Not Found with this id"+id));
        return convertTODto(Book);

    }

    @Override
    public BookDto updateBook(Long id, BookDto bookDto) {
        Book book=bookRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("Book Not Found with this id"+id));
          book.setTitle(bookDto.getTitle());
          book.setAuthor(bookDto.getAuthor());
          book.setAuthor(book.getAuthor());
          book=bookRepository.save(book);
          return convertTODto(book);


    }

    @Override
    public void DeleteBook(Long id) {
      Book book=  bookRepository.findById(id).orElseThrow(()->
              new ResourceNotFoundException("Book Not Found with this id"+id));
      bookRepository.delete(book);

    }
    //first create the new book and save to database
    //we need data repository instance to do operation in database so inject the dependency
    private BookDto convertTODto(Book book) {
        BookDto bookDto=new BookDto();
        bookDto.setTitle(book.getTitle());
        bookDto.setAuthor(book.getAuthor());
        bookDto.setIsbn(book.getIsbn());

        return bookDto;

    }

}

