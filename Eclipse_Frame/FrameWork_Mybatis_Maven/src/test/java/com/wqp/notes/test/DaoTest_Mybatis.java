package com.wqp.notes.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.wqp.notes.dao.NotesMapper;
import com.wqp.notes.po.Notes;

public class DaoTest_Mybatis {
	@Test
	public void te() {
		try {
			SqlSessionFactory sqlSessionFactory;
			// mybatis配置文件
			String resource = "Mybatis/SqlMapConfig.xml";
			InputStream inputStream;
			inputStream = Resources.getResourceAsStream(resource);
			// 使用SqlSessionFactoryBuilder创建sessionFactory
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			// 获取session
			SqlSession session = sqlSessionFactory.openSession();
			// 获取mapper接口的代理对象
			NotesMapper notesMapper = session.getMapper(NotesMapper.class);
			// 调用代理对象方法
			Notes notes = notesMapper.findUser(1);
			System.out.println(notes);
			// 关闭session
			session.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
