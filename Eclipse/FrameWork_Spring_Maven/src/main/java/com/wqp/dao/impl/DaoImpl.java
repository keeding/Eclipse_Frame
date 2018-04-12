package com.wqp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import com.wqp.dao.Dao;

@Component
public class DaoImpl extends JdbcDaoSupport implements Dao {

    @Override
    public void get() {
        try {
            Connection conn = this.getJdbcTemplate().getDataSource().getConnection();
//            Connection conn = this.getJdbcTemplate().getDataSource().getConnection();
            PreparedStatement ptmt = conn.prepareStatement("select Host from user");
            ResultSet resultSet = ptmt.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("Host"));
            }
            resultSet.close();
            ptmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
