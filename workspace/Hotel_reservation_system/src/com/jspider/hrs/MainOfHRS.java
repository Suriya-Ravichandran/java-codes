package com.jspider.hrs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MainOfHRS {
	private static final String dburl="jdbc:mysql://localhost:3306/hotal_db";
	private static final String user="root";
	private static final String password="root";
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
				System.out.println("   Welcome To   ");
				System.out.println(" HOTEL RESERVATION SYSTEM  ");
				Scanner scn=new Scanner(System.in);
				System.out.println("1.RESERVED ROOM");
				System.out.println("2.VIEW RESERVATION");
				System.out.println("3.GET ROOM NUMBER");
				System.out.println("4.UPDATE RESERVATION");
				System.out.println("5.DELETE RESERVATION");
				System.out.println("0.EXIT");
				System.out.println("Choose an option: ");
				int choice =scn.nextInt();
				switch(choice) {
				case 1:ReserveRoom(con,scn);
				break;
				case 2:Viewreservation(con);
				break;
				case 3:GetRoomNo(con,scn);
				break;
				case 4: updateReservation(con,scn);
				break;
				case 5:deletereservation(con,scn);
				break;
				case 0:exit();
				break;
				default:
					System.out.println("Invaild choice... try again...");
				}
				
			}
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}
	private static void ReserveRoom(Connection con,Scanner sc) {
		try {
			System.out.println("Enter Guest Name:");
			String gname=sc.next();
			sc.nextLine();
			System.out.println("Enter Guest contact number:");
			String contact=sc.next();
			sc.nextLine();
			System.out.println("Enter Room number:");
			int room=sc.nextInt();
			String query="INSERT INTO RESERVATIONS(GUEST_NAME,GUEST_PHONE,ROOM_NO) VALUES"+"('"+gname+"','"+contact+"','"+room+"')";
			try(Statement stmt=con.createStatement()){
				int count = stmt.executeUpdate(query);
				if(count >0) {
					System.out.println("Reservation successfully !!");
				}else {
					System.out.println("Reservation Failed");
				}
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	private static void Viewreservation(Connection con) {
		String query="SELECT R_ID,GUEST_NAME,GUEST_PHONE,ROOM_NO,R_DATE FROM RESERVATIONS";
		try(Statement stmt=con.createStatement()){
			ResultSet rs=stmt.executeQuery(query);
			System.out.println("       CURRENT RESERVATION LIST    ");
			System.out.println("-------------------------------------------------------------------------------");
			System.out.println("| R_ID             | GUEST_NAME        | GUEST_PHONE            | R_DATE |");
			System.out.println("-------------------------------------------------------------------------------");
			while(rs.next()) {
				int id=rs.getInt("R_ID");
				String name=rs.getString("GUEST_NAME");
				String phone=rs.getString("GUEST_PHONE");
				int room=rs.getInt("ROOM_NO");
				String date=rs.getTimestamp("R_DATE").toString();
				System.out.printf("| %-14d | %-15s | %-20s | %-13d | %-19s |\n",id,name,phone,room,date);
				System.out.println("-----------------------------------------------------------------------------");
				
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	private static void GetRoomNo(Connection con,Scanner sc) {
		try {
			System.out.println("ENTER RESERVATION ID:");
			int id=sc.nextInt();
			System.out.println("ENTER RESERVATION GUEST NAME");
			String name=sc.next();
			String query="SELECT ROOM_NO FROM RESERVATIONS WHERE R_ID="+id+"AND GUEST_NAME='"+name+"'";
			try(Statement stmt=con.createStatement()){
			ResultSet rs=stmt.executeQuery(query);
			if(rs.next()) {
				int room=rs.getInt("ROOM_NO");
				System.out.println("ROOM_NO FOR GIVEN RESERVATION ID:"+id+"GUEST NAME:"+name);
			}else {
				System.out.println("ROOM_NO RESERVATION NOT FOUND FOR ID:"+id+"GUEST NAME:"+name);
			}
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	private static void updateReservation(Connection con,Scanner sc) {
		try {
			System.out.println("Enter reservation id to update: ");
			int id=sc.nextInt();
			sc.nextLine();
			if(!reservationExists(con,id)) {
				System.out.println("Reservation not found for given id:");
				return;
			}
			System.out.println("Enter new Guest Name:");
			String name=sc.next();
			System.out.println("Enter Guest phone no:");
			String phone=sc.next();
			System.out.println("Enter Room no:");
			int room =sc.nextInt();
			String query=("UPDATE RESERVATIONS SET GUEST_NAME='"+name+"',"+"GUEST_PHONE='"+phone+"',"+"ROOM_NO='"+room+"'"+"WHERE R_ID='"+id+"'");
			try(Statement stmt=con.createStatement()){
				int count = stmt.executeUpdate(query);
				if(count>0) {
					System.out.println("Reservation update successfully");
				}else {
					System.out.println("Reservation update failed!!");
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	private static boolean reservationExists(Connection con,int id){
		try {
			String query="SELECT R_ID FROM RESERVATIONS WHERE R_ID="+id;
			try(Statement stmt=con.createStatement()){
				ResultSet rs=stmt.executeQuery(query);
				return rs.next();
			}
		}catch(Exception e) {
			e.printStackTrace();
			return false;
			
		}
	}
	
	private static void deletereservation(Connection con,Scanner scn) {
		try {
			System.out.println("Enter reservation Id to delete");
			int id=scn.nextInt();
			if(!reservationExists(con,id)) {
				System.out.println("Reservation  Not found for given id to delete");
				return;
			}
			String query="DELETE FROM RESERVATIONS WHERE R_ID="+id;
			try(Statement stmt=con.createStatement()){
				int count =stmt.executeUpdate(query);
				if(count>0) {
					System.out.println("Reservation Delete successfully");
				}else {
					System.out.println("Reservation Delete failed");
				}
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	public static void exit()throws InterruptedException{
		System.out.println("Existing System");
		int i=5;
		while(i!=0) {
			System.out.println(".");
			Thread.sleep(1000);
			i--;
		}
		System.out.println();
		System.out.println("Thank you!! Visit Again!!");
		}

}
