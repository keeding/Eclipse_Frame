package com.keeding.dao.test.impl;

import com.keeding.dao.test.Dao;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
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
