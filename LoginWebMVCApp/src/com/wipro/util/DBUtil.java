package com.wipro.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	public static Connection getConnection() {

		String JDBC_DRIVER = "org.h2.Driver";
		String DB_URL = "jdbc:h2:tcp://localhost/~/test1";
		String USER = "system";
		String PASS = "";

		Connection conn = null;

		try {
			Class.forName(JDBC_DRIVER);
		} catch (ClassNotFoundException cnfex) {
			System.out.println("Driver Error");
		}

		try {
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (SQLException sqlex) {
			System.out.println("Sql Connection error"); 
		}

		return conn;
	}
}
