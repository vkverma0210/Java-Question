package com.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
//import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Statement;

public class UsersManager {

	public static void main(String[] args) {
		String jdbcURL = "jdbc:mySQL://localhost:3306/sampledb";
		String dbusername = "vinaykv";
		String dbpassword = "qazwsx@0210#";

		// 1. Insert Into DB table
//		String fullname = "Ramkrishan Verma";
//		String username = "ramkrishan";
//		String email = "ram.verma26@gmail.com";
//		String password = "12345";
//		
//		try {
//			Connection conn = DriverManager.getConnection(jdbcURL, dbusername, dbpassword);
//			String sql = "INSERT INTO users (username, email, fullname, password)"
//					+ "VALUES(?, ?, ?, ?)";
//
//			PreparedStatement statement = conn.prepareStatement(sql);
//			statement.setString(1, username);
//			statement.setString(2, email);
//			statement.setString(3, password);
//			statement.setString(4, fullname);
//			
//			int rows = statement.executeUpdate();
//
//			if (rows > 0) {
//				System.out.println("A new user has been inserted successfully");
//			}
//		
//			conn.close();
//
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}

		// 2. Retrive data from DB table
//		try {
//			Connection conn = DriverManager.getConnection(jdbcURL, dbusername, dbpassword);
//			String sql = "SELECT * FROM users";
//			Statement statement = conn.createStatement();
//			ResultSet result = statement.executeQuery(sql);
//
//			while (result.next()) {
//				int userID = result.getInt("user_id");
//				String username = result.getString("username");
//				String fullname = result.getString("fullname");
//				String email = result.getString("email");
//				String password = result.getString("password");
//
//				System.out.println(
//						userID + " : " + username + " , " + fullname + " , " + email + " , " + password);
//			}
//
//			conn.close();
//
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}

		// 3. Update data in DB table
//		try {
//			Connection conn = DriverManager.getConnection(jdbcURL, dbusername, dbpassword);
//
//			String sql = "UPDATE users SET password = '234567' WHERE username = 'vinay'";
//			Statement statement = conn.createStatement();
//
//			int rows = statement.executeUpdate(sql);
//
//			if (rows > 0) {
//				System.out.println("Updated...!");
//			}
//
//			conn.close();
//
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}

		// 4. Update data from prepared statement in DB table
//		 String password = "javaguy";
//		String fullname = "John Jim";
//		String email = "john.jim@gmail.com";
//		String username = "ramkrishan";
//		
//		try {
//			Connection conn = DriverManager.getConnection(jdbcURL, dbusername, dbpassword);
//
//			String sql = "UPDATE users SET password = ?, fullname = ?, email = ? WHERE username = ?";
//			PreparedStatement statement = conn.prepareStatement(sql);
//			statement.setString(1, password);
//			statement.setString(2, fullname);
//			statement.setString(3, email);
//			statement.setString(4, username);
//			
//			int rows = statement.executeUpdate();
//
//			if (rows > 0) {
//				System.out.println("Updated...!");
//			}
//
//			conn.close();
//
//		} catch (SQLException e) {
//
//			e.printStackTrace();
//		}
		
		// 4. Delete data from DB table
				String username = "ramkrishan";
				
				try {
					Connection conn = DriverManager.getConnection(jdbcURL, dbusername, dbpassword);

					String sql = "DELETE FROM users WHERE username = ?";
					PreparedStatement statement = conn.prepareStatement(sql);
					statement.setString(1, username);
					
					int rows = statement.executeUpdate();

					if (rows > 0) {
						System.out.println("Deleted...!");
					}

					conn.close();

				} catch (SQLException e) {

					e.printStackTrace();
				}
	}

}
