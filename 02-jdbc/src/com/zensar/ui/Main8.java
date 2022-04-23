package com.zensar.ui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main8 {
	public static void main(String[] args) throws SQLException {
		Connection connection = DBConnection.create();

		String sql = "update product set name=?,price=? where id=?";
		int id;
		String newName;
		double newPrice;

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter new Name");
		newName = scanner.next();

		System.out.println("enter new price");
		newPrice = scanner.nextDouble();

		System.out.println("enter id");
		id = scanner.nextInt();

		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setString(1, newName);
		pst.setDouble(2, newPrice);
		pst.setInt(3, id);
		int result = pst.executeUpdate();
		System.out.println(result);
	}
}
