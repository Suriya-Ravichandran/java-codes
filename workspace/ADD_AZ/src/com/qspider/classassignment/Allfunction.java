package com.qspider.classassignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Allfunction {
	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
	        int num;

	        // Start of the loop
	        while (true) {
	            System.out.println("ENTER 1 TO INSERT\n2 TO UPDATE\n3 TO DELETE\n4 TO EXIT\n");
	            num = scn.nextInt();

	            if (num == 1) {
	                insert();
	            } else if (num == 2) {
	                update();
	            } else if (num == 3) {
	                delete();
	            } else if (num == 4) {
	                System.out.println("Exiting...");
	                break; // Exit the loop
	            } else {
	                System.out.println("Make a correct choice...!");
	            }
	        }
		
	}
		public static void insert() {
			@SuppressWarnings("resource")
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter country code id:");
			int countrycode=scn.nextInt();
			System.out.println("Enter country name:");
			String countryname=scn.next();
			System.out.println("Enter country capital name:");
			String countrycapital=scn.next();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String dburl="jdbc:mysql://localhost:3306/world?user=root&password=root";
				Connection con=DriverManager.getConnection(dburl);
				String query="INSERT INTO COUNTRY(COUNTRY_CODE,COUNTRY_NAME,COUNTRY_CAPITAL) VALUES"
						+"(?,?,?)";
				PreparedStatement psmt=con.prepareStatement(query);
				psmt.setInt(1, countrycode);
				psmt.setString(2, countryname);
				psmt.setString(3, countrycapital);
				int count=psmt.executeUpdate();
				if(count>0) {
					System.out.println("Data inserted done");
				}else {
					System.out.println("Data inserted failed");
				}
				con.close();
				psmt.close();
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		public static void update() {
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
		
		public static void delete() {
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
