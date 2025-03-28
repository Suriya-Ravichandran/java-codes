package com.jspider.sp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ProcedureUpdate {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter id:");
		int id=scn.nextInt();
		System.out.println("Enter fname:");
		String fname=scn.next();
		System.out.println("Enter lname");
		String lname=scn.next();
		System.out.println("Enter age");
		String age=scn.next();
		System.out.println("Enter phone");
		String phone=scn.next();
		System.out.println("Enter country");
		String country=scn.next();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/add_a2?user=root&password=root";
			Connection con=DriverManager.getConnection(dburl);
			String procedure="CALL `add_a2`.`customerupdate`(?,?,?,?,?,?)";
			CallableStatement csmt= con.prepareCall(procedure);
			csmt.setInt(1, id);
			csmt.setString(2,fname);
			csmt.setString(3,lname);
			csmt.setString(4,age);
			csmt.setString(5,phone);
			csmt.setString(6,country);
			
			int count= csmt.executeUpdate();
			if(count>0) {
				System.out.println("Data update successfully");
			}else {
				System.out.println("Data update failed");
			}
			con.close();
			csmt.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
