package com.keeding.dao.test;

import com.keeding.notes.dao.NotesMapper;
import com.keeding.notes.po.Notes;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDao_SpringMybatis {
    @Test
    public void te(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("classpath:Spring_Mybatis/applicationContext.xml");
        NotesMapper notesMapper = (NotesMapper) app.getBean("notesMapper");
        Notes findUser = notesMapper.findUser(5);
        System.out.println(findUser);
    }
}
