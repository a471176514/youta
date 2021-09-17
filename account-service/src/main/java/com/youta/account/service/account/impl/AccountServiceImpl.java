package com.youta.account.service.account.impl;

import com.youta.account.mapper.AccountMapper;
import com.youta.account.model.Account;
import com.youta.account.service.account.IAccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: ymy
 * @createDate: 2021/09/16 17:00
 * @version: 1.0N */
@Service
public class AccountServiceImpl implements IAccountService {

    @Resource
    private AccountMapper accountMapper;

    @Override
    public Account queryAccount(Long id) {
        return accountMapper.queryAccount(id);
    }
}
