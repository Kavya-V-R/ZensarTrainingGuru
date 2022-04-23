package com.zensar.ui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main7 {
	public static void main(String[] args) throws SQLException {
		Connection connection = DBConnection.create();
		
		String sql = "insert into product values(?,?,?)";
		Scanner scanner = new Scanner(System.in);

		System.out.println("ID  ");
		int id = scanner.nextInt();

		System.out.println("Product Name  ");
		String name = scanner.next();

		System.out.println("Price  ");
		double price = scanner.nextDouble();
		
		PreparedStatement pst=connection.prepareStatement(sql);
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setDouble(3, price);
		
		int result=pst.executeUpdate();
		System.out.println(result);
	}
}
