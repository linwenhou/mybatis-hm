package com.venvo.dao;

import com.venvo.domain.User;

import java.util.List;

/**
 * @version jdk1.8
 ** @author venvo
 *
 * 用户的持久层接口
 */
public interface IUserDao {

    /**
     * 查询所有操作
     * @return
     */
    List<User> findAll();
}
