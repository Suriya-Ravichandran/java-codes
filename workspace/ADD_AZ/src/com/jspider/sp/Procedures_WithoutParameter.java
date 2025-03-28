package com.jspider.sp;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Procedures_WithoutParameter {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/add_a2?user=root&password=root";
			Connection con=DriverManager.getConnection(dburl);
			String procedure="call add_a2.getCustomerDetials()";
			CallableStatement csmt=con.prepareCall(procedure);
			ResultSet rs=csmt.executeQuery();
			System.out.println("--------------PROCEDURE WITHOUT PARAMETER------------");
			System.out.println("--------------------CUSTOMER TABLE-------------------");
			System.out.println("ID\t FNAME\t LNAME\t AGE\t PHONE\t COUNTRY\t");
			System.out.println("------------------------------------------------------");
			while(rs.next()) {
				int id=rs.getInt(1);
				String fname=rs.getString(2);
				String lname=rs.getString(3);
				String age=rs.getString(4);
				String phone=rs.getString(5);
				String country=rs.getString(6);
				System.out.println(id+"\t"+fname+"\t"+lname+"\t"+age+"\t"+phone+"\t"+country);
			}
			csmt.close();
			rs.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
