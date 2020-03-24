package com.venvo.dao;

import com.venvo.domain.User;

import java.util.List;

/**
 * @version jdk1.8
* @author venvo
 *
 * 用户的持久层接口
 */
public interface IUserDao {

    /**
     * 查询所有用户，同时获取到用户下所有账户的信息
     * @return
     */
    List<User> findAll();


    /**
     * 根据id查询用户信息
     * @param userId
     * @return
     */
    User findById(Integer userId);


}
