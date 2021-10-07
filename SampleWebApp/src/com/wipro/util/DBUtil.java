package com.wipro.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getDBConnection() {
		Connection conn = null;
		
		try {
			Class.forName("org.h2.Driver");
		}
		catch(ClassNotFoundException cnfex)
		{
			System.out.println("Driver Error");
		}
		
		try {
			conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test1","system", "");
		}
		catch(SQLException sqlex)
		{
			System.out.println("SQLConnection Error");
		}
		
		return conn;
	}
}
