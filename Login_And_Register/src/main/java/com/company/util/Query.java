package com.company.util;


public class Query {
	
    public static String insert = "INSERT INTO users(username,email,password) VALUES(?,?,?);";
    public static String read = "SELECT * FROM users WHERE username = ? AND password = ?;";
   

}
