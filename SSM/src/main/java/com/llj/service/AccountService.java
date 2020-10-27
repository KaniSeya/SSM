package com.llj.service;

import com.llj.domain.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();

    void saveAccount(Account account);
}
