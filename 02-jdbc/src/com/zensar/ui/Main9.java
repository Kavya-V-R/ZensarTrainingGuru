package com.zensar.ui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Main9 {
public static void main(String[] args) throws SQLException {
	Connection connection=DBConnection.create();
	
	String sql="delete from product where id=?";
	
	//task
	Scanner scanner = new Scanner(System.in);
	System.out.println("enter id");
	int id = scanner.nextInt();
	
	PreparedStatement pst = connection.prepareStatement(sql);
	pst.setInt(1, id);
	int result = pst.executeUpdate();
	System.out.println(result);

}
}
