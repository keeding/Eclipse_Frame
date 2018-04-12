package com.keeding.dao.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JunitTest {
    @Test
    public void testDao(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dao dao = (Dao) app.getBean("daoImpl");
        dao.get();
    }
}
