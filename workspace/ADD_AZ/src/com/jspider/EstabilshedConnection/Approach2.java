package com.jspider.EstabilshedConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Approach2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/add_a2?";
			String user="root";
			String password="root";
			@SuppressWarnings("unused")
			Connection con=DriverManager.getConnection(dburl,user,password);
			System.out.println("Connection established successfully");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
  