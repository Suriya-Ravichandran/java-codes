package com.qspider.classassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class world_delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter Country name to delete the data");
		String countryname =scn.next();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/world?user=root&password=root";
			Connection con=DriverManager.getConnection(dburl);
			String query="DELETE FROM COUNTRY WHERE COUNTRY_NAME=?";
			PreparedStatement psmt=con.prepareStatement(query);
			psmt.setString(1, countryname);
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
