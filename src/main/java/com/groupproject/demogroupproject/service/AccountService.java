package com.groupproject.demogroupproject.service;

import com.groupproject.demogroupproject.domain.Account;
import com.groupproject.demogroupproject.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    private AccountRepository accountRepository;

    //create an account method
    public void createAccount(Long customer_id, Account account){
        accountRepository.save(account);
        

    }

    //get all accounts method
    public Iterable<Account> getAllAccounts(){
       return accountRepository.findAll();
    }

    //get an account by ID method
    public Optional<Account> getAnAccount(Long id){
        return accountRepository.findById(id);
    }

    //get all accounts by ID method
    public Iterable<Account> getAllAccountsByID(Long id){
        return accountRepository.findAllById(id);
    }

    //delete a specific account method
    public void deleteAccount(Long id){
        accountRepository.deleteById(id);
    }

    //update an account method
    public void updateAnAccount(Account account){
        accountRepository.save(account);
    }

    //exists by ID method
    public Boolean accountExists(Long id){
        return accountRepository.existsById(id);
    }
}
