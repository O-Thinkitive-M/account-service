package com.example.account.service;

import com.example.account.entity.Account;

import java.util.List;

public interface AccountService {


    Account getAccount(Long id);

    List<Account> getAllAccounts();
    List<Account> getAccountList(Long userid);

    String deleteAccount(Long id);

    String updateAccount(Account account);

    Account create(Account account);

    List<Account> saveAccountsListToSingleUser(List<Account> accountsList, Long id);

}
