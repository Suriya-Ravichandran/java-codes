package com.jspider.EstabilshedConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Approach1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/javadb?user=root&password=";
			@SuppressWarnings("unused")
			Connection con=DriverManager.getConnection(dburl);
			System.out.println("Connection Estabilshed successfully");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
