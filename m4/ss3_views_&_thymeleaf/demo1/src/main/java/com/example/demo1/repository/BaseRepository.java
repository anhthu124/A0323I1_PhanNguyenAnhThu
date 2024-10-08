package com.example.demo1.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseRepository {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/product_management";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "123456";
    private BaseRepository() {
    }

    static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(JDBC_URL,USERNAME,PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
