package com.zensar.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main1 {

	public static void main(String[] args) {

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
			con = DriverManager.getConnection(url, username,
					password);
			System.out.println("connection obtain successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//step3
		Statement stmt=null;
		try {
			stmt=con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//step4
		String sql="insert into product values(104,'Mobile',32000.00)";
		
		//step 5
		int result=0;
		try {
			 result=stmt.executeUpdate(sql);
			 System.out.println("1 update added");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}
}
