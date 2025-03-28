package com.jspider.sp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Procedures_within_parameter {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter id in parameters:");
		int id=scn.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/add_a2?user=root&password=root";
			Connection con=DriverManager.getConnection(dburl);
			String procedure="CALL `ADD_A2`.`getCustomer`(?)";
			CallableStatement csmt= con.prepareCall(procedure);
			csmt.setInt(1, id);
			ResultSet rs=csmt.executeQuery();
			System.out.println("----------PROCEDURE WITH IN PARAMETER------------");
			System.out.println("ID\t FNAME\t LNAME\t AGE\t PHONE\t\t COUNTRY\t");
			if(rs.next()) {
				int id1=rs.getInt(1);
				String fname=rs.getString(2);
				String lname=rs.getString(3);
				String age=rs.getString(4);
				String phone=rs.getString(5);
				String country=rs.getString(6);
				System.out.println(id1+"\t"+fname+"\t"+lname+"\t"+age+"\t"+phone+"\t"+country);
			}else {
				System.out.println("Invaild parameter!!!!");
			}
			con.close();
			csmt.close();
			rs.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
