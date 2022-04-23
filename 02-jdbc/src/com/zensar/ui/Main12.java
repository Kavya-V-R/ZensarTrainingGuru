package com.zensar.ui;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main12 {
public static void main(String[] args) throws SQLException {
	Connection connection=DBConnection.create();
	
	String sql="select sum(price) from product";
	
	Statement stmt=connection.createStatement();
	ResultSet rs=stmt.executeQuery(sql);
	rs.next();
	System.out.println("sum price "+rs.getDouble(1));
	rs.close();
	connection.close();
}
}
