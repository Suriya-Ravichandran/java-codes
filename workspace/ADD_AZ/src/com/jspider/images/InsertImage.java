package com.jspider.images;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertImage {

	public static void main(String[] args) {
		Connection con=null;
		PreparedStatement psmt=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String dburl="jdbc:mysql://localhost:3306/add_a2?user=root&password=root";
			con=DriverManager.getConnection(dburl);
			String query="INSERT INTO COUNTRY(C_CODE,C_NAME,C_FLAG) VALUES(?,?,?)";
		    psmt=con.prepareStatement(query);
			psmt.setInt(1, 92);
			psmt.setString(2, "India");
			FileInputStream fis= new FileInputStream("C:\\Users\\Suriya Ravichandran\\Downloads\\india.png");
			psmt.setBinaryStream(3, fis);
			int count=psmt.executeUpdate();
			if(count>0) {
				System.out.println("image insert successfully");	
				}else {
					System.out.println("try again");
				}
		} catch (ClassNotFoundException | SQLException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(con !=null){
				try {
					con.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
			if(psmt !=null){
				try {
					psmt.close();
				}catch(SQLException e) {
					e.printStackTrace();
				}
			}
		}
		

	}

}
