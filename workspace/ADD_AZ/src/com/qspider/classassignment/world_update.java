package com.qspider.classassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class world_update {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter country code:");
		int countrycode=scn.nextInt();
		System.out.println("Enter country name:");
		String countryname=scn.next();
		System.out.println("Enter country capital name:");
		String countrycapital=scn.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/world?user=root&password=root";
			Connection con=DriverManager.getConnection(dburl);
			String query="UPDATE COUNTRY SET COUNTRY_NAME=?,COUNTRY_CAPITAL=? WHERE COUNTRY_CODE=?";
			PreparedStatement psmt=con.prepareStatement(query);
			psmt.setString(1, countryname);
			psmt.setString(2, countrycapital);
			psmt.setInt(3, countrycode);
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
