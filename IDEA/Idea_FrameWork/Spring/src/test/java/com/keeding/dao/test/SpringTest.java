package com.keeding.dao.test;

import com.keeding.dao.test.impl.DaoImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class SpringTest {

    @Autowired
    private DaoImpl daoImpl;

    @Test
    public void demo() {
        try {
            daoImpl.get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
