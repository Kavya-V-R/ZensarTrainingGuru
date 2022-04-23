package com.zensar.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	public Connection createConnection() {
		// step1
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded successfully");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// step2
		String url = "jdbc:mysql://localhost:3306/trainingdb1";
		String username = "root";
		String password = "root";

		Connection con = null;
		try {
			con = DriverManager.getConnection(url, username, password);
			System.out.println("connection obtain successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;

	}

	public void closeConnection(Connection connection) {
		try {
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
