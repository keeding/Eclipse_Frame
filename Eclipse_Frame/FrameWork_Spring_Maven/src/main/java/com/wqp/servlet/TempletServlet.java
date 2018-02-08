package com.wqp.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wqp.dao.Dao;

public class TempletServlet extends HttpServlet {
	/**
	 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 * Filter、Servlet不受Spring管理
	 * !!!!!!!!!!!!!!!!!!!!!!!!!!!!
	 */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        Dao dao = (Dao) app.getBean("daoImpl");
        dao.get();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
