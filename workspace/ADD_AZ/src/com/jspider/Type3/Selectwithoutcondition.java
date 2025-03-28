package com.jspider.Type3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Selectwithoutcondition {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/add_a2?user=root&password=root";
			Connection con =DriverManager.getConnection(dburl);
			String query="SELECT * FROM CUSTOMER";
			PreparedStatement psmt=con.prepareStatement(query);
			ResultSet rs=psmt.executeQuery();
			System.out.println("-------CUSTOMER TABLE DATA---------");
			System.out.println("ID\t FNAME\t LNAME\t AGE\t PHONE\t COUNTRY");
			System.out.println("------------------------------------------");
			while(rs.next()) {
				int id=rs.getInt(1);
				String fname=rs.getString(2);
				String lname=rs.getString(3);
				int age=rs.getInt(4);
				long phone=rs.getLong(5);
				String country=rs.getString(6);
				System.out.println(id+"\t"+fname+"\t"+lname+"\t"+age+"\t"+phone+"\t"+country+"\t");
			}
			psmt.close();
			con.close();
			rs.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
