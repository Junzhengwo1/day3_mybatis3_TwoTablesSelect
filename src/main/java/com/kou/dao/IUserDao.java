package com.kou.dao;

import com.kou.domain.User;

import java.util.List;

/**
 * @author dell
 */
public interface IUserDao {
    /**
     * 查询所有
     * @return
     */
    //@Select("select * from user")
    List<User> findAll();


    /**
     * 查询所有用户对应的角色
     * @return
     */
    List<User> findAllUserAndRole();

    /**
     * 根据Id查询用户
     * @param userId
     * @return
     */
    User findById(Integer userId);



}
