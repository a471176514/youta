package com.youta.account.controller.account;

import com.youta.account.model.Account;
import com.youta.account.service.account.IAccountService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Objects;


/**
 * @description:
 * @author: ymy
 * @createDate: 2021/09/16 16:38
 * @version: 1.0
 */
@RestController
@RequestMapping("/account")
public class AccountCon {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountCon.class);

    @Resource
    private IAccountService accountService;

    @GetMapping("/queryAccount/{id}")
    public Account queryAccount(@PathVariable Long id){
        LOGGER.info("account queryAccount id=" + id);
        Objects.requireNonNull(id,"id is not null");
        return accountService.queryAccount(id);
    }

}
