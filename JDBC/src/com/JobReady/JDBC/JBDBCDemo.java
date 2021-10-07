package com.JobReady.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JBDBCDemo {

	public static void main(String[] args) {

		String url = "jdbc:mySQL://localhost:3306/employees_database";
		int rowsAffected;

		try {
			// Establish Connection Object
			Connection conn = DriverManager.getConnection(url, "vinaykv", "qazwsx@0210#");

			// Create a statement Object to send to the database
			Statement statement = conn.createStatement();

			// Execute the statement object
//			ResultSet resultSet = statement.executeQuery("Select * from employees_tbl");
//			
//			//Process the result
//			int salaryTotal = 0;
//			while(resultSet.next()) {
//				salaryTotal += resultSet.getInt("salary");
//			}
//			
//			System.out.println(salaryTotal);

//			// Execute Update
//			rowsAffected = statement.executeUpdate("insert into employees_tbl (id, name, dept, salary) values(900, 'Jully', 'Sales', 6000);");
//			
//			//Process the result
//			System.out.println("Executed on Insert statement - Rows Affected" + rowsAffected);

			// Execute the Delete
//			rowsAffected = statement.executeUpdate("DELETE FROM employees_tbl;");
//			System.out.println("Executed on Delete statement - Rows Affected" + rowsAffected);
			
			// Update Statement
			rowsAffected = statement.executeUpdate("UPDATE employees_tbl SET salary = 5500 where id = 600;");
			System.out.println("Executed on Delete statement - Rows Affected" + rowsAffected);
			
		} catch (SQLException e) {
			System.out.println("Error while deleting");
		}

	}

}
