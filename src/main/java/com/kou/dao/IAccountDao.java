package com.kou.dao;

import com.kou.domain.Account;
import com.kou.domain.AccountUser;

import java.util.List;

/**
 * @author dell
 */
public interface IAccountDao {

    /**
     * 查询所有账户
     * @return
     */
    List<Account> findAllAccount();

    /**
     * 查询所有账户，并且带有用户名称和地址信息
     * @return
     */
    List<AccountUser> findAllUserAndAccount();

}
