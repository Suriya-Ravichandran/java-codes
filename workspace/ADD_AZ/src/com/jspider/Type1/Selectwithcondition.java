package com.jspider.Type1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Selectwithcondition {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/add_a2?user=root&password=root";
			Connection con =DriverManager.getConnection(dburl);
			String query="SELECT * FROM CUSTOMER WHERE ID=1";
			Statement stmt=con.createStatement();
			ResultSet rs =stmt.executeQuery(query);
			System.out.println("-------CUSTOMER TABLE DATA---------");
			System.out.println("ID\t FNAME\t LNAME\t AGE\t PHONE\t COUNTRY");
			System.out.println("------------------------------------------");
			if(rs.next()) {
				int id=rs.getInt(1);
				String fname=rs.getString(2);
				String lname=rs.getString(3);
				int age=rs.getInt(4);
				long phone=rs.getLong(5);
				String country=rs.getString(6);
				System.out.println(id+"\t"+fname+"\t"+lname+"\t"+age+"\t"+phone+"\t"+country+"\t");
			}else {
				System.out.println("Invalid id");
			}
			stmt.close();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		

	}

}
