package com.venvo.dao.impl;

import com.venvo.dao.IUserDao;
import com.venvo.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @version jdk1.8
 ** @author venvo
 */
public class UserDaoImpl implements IUserDao {

    private SqlSessionFactory factory;

    public UserDaoImpl(SqlSessionFactory  factory){
        this.factory = factory;
    }


    public List<User> findAll(){
        //1.使用工厂创建SqlSession对象
        SqlSession session = factory.openSession();
        //2.使用session执行查询所有方法
        List<User> users = session.selectList("com.venvo.dao.IUserDao.findAll");
        session.close();
        //3.返回查询结果
        return users;
    }
}
