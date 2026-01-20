package com.example.jdbc_maven;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {

    private static final String URL = "jdbc:postgresql://localhost:5432/training_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "postgres";
	public static void main(String[] args) {
	try {
		Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
		System.out.println("Connected successfully to dbase.");
		con.close();		
		System.out.println("Dbase connection closed.");
	}catch(Exception e){
		System.out.println("Connection Unsuccessful.");
		System.err.println(e);
	}
	}

}
