package com.example.account.service.AccountServiceImpl;

import com.example.account.entity.Account;
import com.example.account.repo.AccountRepo;
import com.example.account.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepo accountRepo;



    @Override
    public Account getAccount(Long id) {
        return null;
    }

    @Override
    public List<Account> getAllAccounts() {
        return accountRepo.findAll();
    }

    @Override
    public List<Account> getAccountList(Long userid) {
        return accountRepo.findByUserid(userid);
    }

    @Override
    public String deleteAccount(Long id) {
        return "";
    }

    @Override
    public String updateAccount(Account account) {
        return "";
    }

    @Override
    public Account create(Account account) {
        try {
            return accountRepo.save(account);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Account> saveAccountsListToSingleUser(List<Account> accountsList, Long id) {

        List<Account> l=accountsList.stream().map(account -> {account.setUserid(id);
          return account;
        }).collect(Collectors.toList());
        return accountRepo.saveAll(l);
    }

}