package com.venvo.mybatis.sqlsession.defaults;

import com.venvo.mybatis.cfg.Configuration;
import com.venvo.mybatis.sqlsession.SqlSession;
import com.venvo.mybatis.sqlsession.SqlSessionFactory;


/**
 * @version jdk1.8
 ** @author venvo
 * SqlSessionFactory接口的实现类
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory{

    private Configuration cfg;

    public DefaultSqlSessionFactory(Configuration cfg){
        this.cfg = cfg;
    }

    /**
     * 用于创建一个新的操作数据库对象
     * @return
     */
    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(cfg);
    }
}
