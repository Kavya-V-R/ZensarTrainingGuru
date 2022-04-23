package com.zensar.ui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main10 {
	public static void main(String[] args) throws SQLException {
		Connection connection = DBConnection.create();

		String sql = "select*from product where id=?";

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter id");
		int id = scanner.nextInt();

		PreparedStatement pst = connection.prepareStatement(sql);
		pst.setInt(1, id);;
		
		ResultSet rs = pst.executeQuery();

		if(rs.next()) {
			System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t"
					+ rs.getDouble(3));
			System.out.println();
		}
		rs.close();
		connection.close();
	}
}
