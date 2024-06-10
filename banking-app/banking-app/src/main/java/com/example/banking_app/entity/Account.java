package com.example.banking_app.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Setter//set the value in database
@Getter//get the value//in database base
@Table(name="accounts")
@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name="accounts_name_holder")
    private String accountHolderName;
    private Double amount;


    public Account() {
        //default constructor
    }


    public Account(Long id,String accountHolderName,Double amount) {
        this.id = id;
        this.accountHolderName = accountHolderName;
        this.amount = amount;

    }



}