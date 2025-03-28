package com.jspider.images;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateImage {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/add_a2?user=root&password=root";
			Connection con=DriverManager.getConnection(dburl);
			String query="UPDATE COUNTRY SET C_NAME=?,C_FLAG=? WHERE C_CODE=?";
			PreparedStatement psmt=con.prepareStatement(query);
			psmt.setInt(3, 91);
			psmt.setString(1, "USA");
			FileInputStream fis= new FileInputStream("C:\\Users\\Suriya Ravichandran\\Downloads\\USA.png");
			psmt.setBinaryStream(2, fis);
			int count=psmt.executeUpdate();
			if(count>0) {
				System.out.println("image update successfully");	
				}else {
					System.out.println("try again");
				}
		} catch (ClassNotFoundException | SQLException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
