package com.zensar.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main6 {
public static void main(String[] args) throws SQLException {
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
String sql="delete from product where id=102";

//step5
 
	int result=stmt.executeUpdate(sql);
	System.out.println(result +"record deleted");
//step6
con.close();
}
}
