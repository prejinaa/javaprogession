package com.example.banking_app.services;

import com.example.banking_app.dto.AccountDto;

import java.util.List;

public interface AccountServices {
     AccountDto createAccount(AccountDto accountDto);
     AccountDto getAccountById(Long id);
     AccountDto deposit(Long id,Double amount );
     AccountDto withdraw(Long id,Double amount);
     List<AccountDto> getAllAccounts();
     void delete(Long id);
}
