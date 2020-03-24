package com.venvo.mybatis.sqlsession;

/**
 * @version jdk1.8
 ** @author venvo
 */
public interface SqlSessionFactory {

    /**
     * 用于打开一个新的SqlSession对象
     * @return
     */
    SqlSession openSession();
}
