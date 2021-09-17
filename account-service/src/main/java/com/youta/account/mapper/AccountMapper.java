package com.youta.account.mapper;

import com.youta.account.model.Account;
import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: ymy
 * @createDate: 2021/09/16 17:04
 * @version: 1.0
 */
@Repository
public interface AccountMapper {

    Account queryAccount(Long id);

}
