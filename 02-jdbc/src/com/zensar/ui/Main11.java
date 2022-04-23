package com.zensar.ui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main11 {
	public static void main(String[] args) throws SQLException {
		Connection connection = DBConnection.create();
		String sql = "select*from product where price>=?";

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter price");
		double Price = scanner.nextDouble();
		try {
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setDouble(1, Price);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t"
						+ rs.getDouble(3));
			}
			rs.close();
			connection.close();

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}

	}
}
