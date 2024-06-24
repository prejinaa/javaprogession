package com.example.BookSystem.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

//this class tell the spring boot to store the data into the database in the form of table
@Entity
@Table(name="Book")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Book {
    //make id to primary key
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String isbn;

    //here we map all the data which we have to store in database

}

