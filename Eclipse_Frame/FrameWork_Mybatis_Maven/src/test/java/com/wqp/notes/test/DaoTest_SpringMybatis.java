package com.wqp.notes.test;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wqp.notes.dao.NotesMapper;
import com.wqp.notes.po.Notes;

public class DaoTest_SpringMybatis {
	@Test
	public void te(){
		ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("classpath:Spring_Mybatis/applicationContext.xml");
		NotesMapper notesMapper = (NotesMapper) app.getBean("notesMapper");
		Notes findUser = notesMapper.findUser(5);
		System.out.println(findUser);
	}
}
