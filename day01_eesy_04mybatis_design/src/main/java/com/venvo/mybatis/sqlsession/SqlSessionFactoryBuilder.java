package com.venvo.mybatis.sqlsession;

import com.venvo.mybatis.cfg.Configuration;
import com.venvo.mybatis.sqlsession.defaults.DefaultSqlSessionFactory;
import com.venvo.mybatis.utils.XMLConfigBuilder;

import java.io.InputStream;

/**
 * @version jdk1.8
 ** @author venvo
 *  用于创建一个SqlSessionFactory对象
 */
public class SqlSessionFactoryBuilder {

    /**
     * 根据参数的字节输入流来构建一个SqlSessionFactory工厂
     * @param config
     * @return
     */
    public SqlSessionFactory build(InputStream config){
        Configuration cfg = XMLConfigBuilder.loadConfiguration(config);
        return  new DefaultSqlSessionFactory(cfg);
    }
}
