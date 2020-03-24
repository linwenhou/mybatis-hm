package com.venvo.dao;

import com.venvo.domain.Role;

import java.util.List;

/**
 * @version jdk1.8
* @author venvo
 */
public interface IRoleDao {

    /**
     * 查询所有角色
     * @return
     */
    List<Role> findAll();
}
