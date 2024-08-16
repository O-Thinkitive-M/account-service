package com.example.account.controller;

import com.example.account.entity.Account;
import com.example.account.service.AccountServiceImpl.AccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountServiceImpl accountServiceImpl;

    @GetMapping("/list/{id}")
    public List<Account> getAccountsByUserId(@PathVariable Long id)
    {
        return accountServiceImpl.getAccountList(id);
    }
    @PostMapping("/create")
    public Account create(@RequestBody Account account)
    {
        return accountServiceImpl.create(account);
    }

    @PostMapping("/saveAccountsList")
    public List<Account> saveAccountList(@RequestBody List<Account> accountsList, Long id)
    {
        return accountServiceImpl.saveAccountsListToSingleUser(accountsList,id);
    }

    @GetMapping("/getaccounts")
    public List<Account> getAccounts()
    {
        return accountServiceImpl.getAllAccounts();
    }



}