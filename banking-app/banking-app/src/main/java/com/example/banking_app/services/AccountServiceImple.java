package com.example.banking_app.services;

import com.example.banking_app.dto.AccountDto;
import com.example.banking_app.entity.Account;
import com.example.banking_app.mapper.AccountMapper;
import com.example.banking_app.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service

public class AccountServiceImple implements AccountServices {
    private AccountRepository accountRepository;

    public AccountServiceImple(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account= AccountMapper.mapToAccount(accountDto);
        Account SaveAccount=accountRepository.save(account);

        return AccountMapper.mapToAccount(SaveAccount);
    }

    @Override
    public AccountDto getAccountById(Long id) {
        Account account=accountRepository.findById(String.valueOf(id)).orElseThrow(()->new RuntimeException("Account doesnot exist"));
        return AccountMapper.mapToAccount(account);
    }

    @Override
    public AccountDto deposit(Long id, Double amount) {
        Account account=accountRepository.findById(String.valueOf(id)).
                orElseThrow(()->new RuntimeException("Account Doesn't Exit"));
        Double total=account.getAmount()+amount;
        account.setAmount(total);
       Account saveAccount= accountRepository.save(account);
        return AccountMapper.mapToAccount(saveAccount);
    }

    @Override
    public AccountDto withdraw(Long id, Double amount) {
        Account account=accountRepository.findById(String.valueOf(id))
                .orElseThrow(()->new RuntimeException("Account doenot exist"));
        if(account.getAmount()<amount){
            throw new RuntimeException("insufficient balance");
        }
        Double total= account.getAmount()-amount;
        account.setAmount(total);
        Account saveAccount=accountRepository.save(account);
        return AccountMapper.mapToAccount(saveAccount);
    }

    @Override
    public List<AccountDto> getAllAccounts() {
        List<Account> accounts=accountRepository.findAll();
     return accounts.stream().map(AccountMapper::mapToAccount).collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        Account account=accountRepository.findById(String.valueOf(id)).orElseThrow(()->new RuntimeException("Account doesnot exist"));

        accountRepository.deleteById(String.valueOf(id));

    }


}
