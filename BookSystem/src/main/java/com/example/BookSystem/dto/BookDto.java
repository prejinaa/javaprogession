package com.example.BookSystem.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Setter
@Getter
//The DTO class for transferring book data between client and server.



public class BookDto {

    @NotBlank
    private String title;

    @NotBlank
    private String author;


    private String isbn;


}