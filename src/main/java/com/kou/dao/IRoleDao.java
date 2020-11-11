package com.kou.dao;

import com.kou.domain.Role;

import java.util.List;

/**
 * @author dell
 */
public interface IRoleDao {

    /**
     * 查询所有 Role
     * @return
     */
    List<Role> findAllRole();

}
