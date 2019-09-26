package com.itheima.service;

import com.itheima.domain.Account;
import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.List;

public interface AccountService {

    public void save(Account account);

    public List<Account> findAll();

    void  del(int id);

}
