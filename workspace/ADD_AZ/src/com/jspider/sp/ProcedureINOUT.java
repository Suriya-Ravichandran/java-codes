package com.jspider.sp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class ProcedureINOUT {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scn=new Scanner(System.in);
		 System.out.println("Enter id");
		int id=scn.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/add_a2?user=root&password=root";
			Connection con=DriverManager.getConnection(dburl);
			String procedure="CALL `add_a2`.`getCustomerAge`(?)";
			CallableStatement csmt= con.prepareCall(procedure);
			csmt.setInt(1, id);
			csmt.registerOutParameter(1,Types.VARCHAR);
			csmt.executeQuery();
			System.out.println("----------Procedures with inout parameter----------");
			System.out.println("ID \t AGE");
			System.out.println("------------");
			System.out.println(id+"\t"+csmt.getString(1));
			con.close();
			csmt.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
