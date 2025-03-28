package com.qspider.Type4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Otherthenselect_delete {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter customer First name");
		String fname =scn.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/add_a2?user=root&password=root";
			Connection con=DriverManager.getConnection(dburl);
			String query="DELETE FROM CUSTOMER WHERE F_NAME=?";
			PreparedStatement psmt=con.prepareStatement(query);
			psmt.setString(1, fname);
			int count=psmt.executeUpdate();
			if(count>0) {
				System.out.println("Data delete done");
			}else {
				System.out.println("Data delete failed");
			}
			con.close();
			psmt.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
