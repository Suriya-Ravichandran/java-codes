package com.qspider.Type4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Otherthenselect_insert {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter customer id:");
		int id=scn.nextInt();
		System.out.println("Enter customer First name:");
		String fname=scn.next();
		System.out.println("Enter customer last name:");
		String lname=scn.next();
		System.out.println("Enter customer age:");
		int age=scn.nextInt();
		System.out.println("Enter customer phone number:");
		long phone=scn.nextLong();
		System.out.println("Enter country name:");
		String country=scn.next();
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/add_a2?user=root&password=root";
			Connection con=DriverManager.getConnection(dburl);
			String query="INSERT INTO CUSTOMER(ID,F_NAME,L_NAME,AGE,PHONE,COUNTRY) VALUES"
					+"(?,?,?,?,?,?)";
			PreparedStatement psmt=con.prepareStatement(query);
			psmt.setInt(1, id);
			psmt.setString(2, fname);
			psmt.setString(3, lname);
			psmt.setInt(4, age);
			psmt.setLong(5,phone);
			psmt.setString(6,country);
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

}
