package com.company.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	 private static final String url = "jdbc:mysql://localhost:3306/login_register";
	 private static final String username = "root";
	 private static final String password = "shah1d@9970;";
   static {
       try {
           // Load the MySQL JDBC driver
           Class.forName("com.mysql.cj.jdbc.Driver");
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
   }

   public static Connection getcon() throws SQLException {
       return DriverManager.getConnection(url, username, password);
   }
}
