package com.jspider.sp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class ProcedureDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter id:");
		int id=scn.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/add_a2?user=root&password=root";
			Connection con=DriverManager.getConnection(dburl);
			String procedure="CALL `add_a2`.`customerdelete`(?);";
			CallableStatement csmt= con.prepareCall(procedure);
			csmt.setInt(1, id);
			
			int count= csmt.executeUpdate();
			if(count>0) {
				System.out.println("Data delete successfully");
			}else {
				System.out.println("Data delete failed");
			}
			con.close();
			csmt.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
