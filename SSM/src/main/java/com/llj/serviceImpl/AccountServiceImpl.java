package com.llj.serviceImpl;

import com.llj.dao.AccountDao;
import com.llj.domain.Account;
import com.llj.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountDao accountdao;

    @Override
    public List<Account> findAll() {
        return accountdao.findAll();
    }

    @Override
    public void saveAccount(Account account) {
       accountdao.saveAccount(account);
    }
}
