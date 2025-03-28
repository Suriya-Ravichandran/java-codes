package com.qspider.Type4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Otherthenselect_update {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter customer last name to update");
		String lname=scn.next();
		System.out.println("Enter vaild customer id");
		int id =scn.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/add_a2?user=root&password=root";
			Connection con=DriverManager.getConnection(dburl);
			String query="UPDATE CUSTOMER SET L_NAME=? WHERE ID=?";
			PreparedStatement psmt=con.prepareStatement(query);
			psmt.setString(1, lname);
			psmt.setInt(2, id);
			int count=psmt.executeUpdate();
			if(count>0) {
				System.out.println("Data update done");
			}else {
				System.out.println("Data update failed");
			}
			con.close();
			psmt.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
