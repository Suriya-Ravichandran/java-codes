package com.jspider.Student_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainOfStudentManagementSystem {
	//Database information
	private static final String dburl="jdbc:mysql://localhost:3306/students_db";
	private static final String user="root";
	private static final String password="root";

	// Main method
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			}catch(ClassNotFoundException e) {
				System.out.println(e.getMessage());
			}
			try {
				Connection con=DriverManager.getConnection(dburl,user,password);
				while(true) {
					System.out.println();
					System.out.println("Welcome To Student Management System");
					System.out.println("-------------------------------------");
					Scanner scn=new Scanner(System.in);
					System.out.println("1.Add Students Details");
					System.out.println("2.Update Students Details");
					System.out.println("3.Delete Students Details");
					System.out.println("4.View Students Details");
					System.out.println("0.EXIT");
					System.out.println("-------------------------------------");
					System.out.println("Choose an option: ");
					int choice =scn.nextInt();
					switch(choice) {
					case 1:addstudents(con,scn);
					break;
					case 2:updatestudents(con,scn);
					break;
					default:
						System.out.println("Invaild choice... try again...");
					}
					
				}
			}catch(Exception e) {
				e.printStackTrace();
				
			}
		}
//end of main method
	
// start Add student method
	private static void addstudents(Connection con,Scanner scn) {
		try {
			System.out.println("Enter Student Name:");
			String name=scn.next();
			System.out.println("Enter Student Email:");
			String email=scn.next();
			System.out.println("Enter Student Gender:");
			String gender=scn.next();
			System.out.println("Enter Student City:");
			String city=scn.next();
			String query="INSERT INTO STUDENTS(NAME,EMAIL,GENDER,CITY) VALUES"+"('"+name+"','"+email+"','"+gender+"','"+city+"')";
			try(Statement stmt=con.createStatement()){
				int count = stmt.executeUpdate(query);
				if(count >0) {
					System.out.println("Student Data Added successfully !!");
				}else {
					System.out.println("Student Data Added Failed");
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
//end of add student method
	
//start of student id exists method
	private static boolean studentnameExists(Connection con,String name){
		try {
			String query="SELECT NAME FROM STUDENTS WHERE NAME="+name;
			try(Statement stmt=con.createStatement()){
				ResultSet rs=stmt.executeQuery(query);
				return rs.next();
			}
		}catch(Exception e) {
			e.printStackTrace();
			return false;
			
		}
	}
//end of student id exists method
	
//start of Update Student Method
	private static void updatestudents(Connection con,Scanner sc) {
		try {
			System.out.println("Enter Student name to update: ");
			String name=sc.next();
			sc.next();
			if(!studentnameExists(con,name)) {
				System.out.println("Reservation not found for given id:");
				return;
			}
			System.out.println("Enter Student Name:");
			String name1=sc.next();
			System.out.println("Enter Email no:");
			String email=sc.next();
			System.out.println("Enter Gender no:");
			String gender =sc.next();
			System.out.println("Enter City no:");
			String city =sc.next();
			String query=("UPDATE STUDENTS SET NAME='"+name1+"',"+"EMAIL='"+email+"',"+"GENDER='"+gender+"',"+"CITY='"+city+"'"+"WHERE NAME='"+name+"'");
			try(Statement stmt=con.createStatement()){
				int count = stmt.executeUpdate(query);
				if(count>0) {
					System.out.println("Students Data updated successfully");
				}else {
					System.out.println("Students Data updated failed!!");
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
//end of Update Student Method	
// end of class	
}
