package com.jspiders.loadingapi;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Approach1 {

	public static void main(String[] args) {
		try {
			java.sql.Driver driver=new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Loading driver done successfully");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
