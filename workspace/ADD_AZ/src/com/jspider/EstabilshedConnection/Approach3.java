package com.jspider.EstabilshedConnection;
import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class Approach3 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			File f =new File("./Credentials/configration.properties");
			FileReader reader=new FileReader(f);
			Properties prop=new Properties();
			prop.load(reader);
			String dburl=prop.getProperty("dburl");
			@SuppressWarnings("unused")
			Connection con=DriverManager.getConnection(dburl,prop);
			System.out.println("Connection established successfully");
		} catch (ClassNotFoundException | IOException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
