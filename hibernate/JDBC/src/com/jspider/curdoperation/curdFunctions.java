package com.jspider.curdoperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class curdFunctions {
  
//  INSERT METHOD
  public static void insert() {
    @SuppressWarnings("resource")
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter id:");
    int id=scn.nextInt();
    System.out.println("Enter name:");
    String name=scn.next();
    System.out.println("Enter type:");
    String type=scn.next();
    System.out.println("Enter rank:");
    String rank=scn.next();
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      String dburl="jdbc:mysql://localhost:3306/network?user=root&password=";
      Connection con=DriverManager.getConnection(dburl);
      String query="INSERT INTO SERVICE_PROVIDER(ID,NAME,TYPE,RANK_NO) VALUES"
          +"(?,?,?,?)";
      PreparedStatement psmt=con.prepareStatement(query);
      psmt.setInt(1, id);
      psmt.setString(2, name);
      psmt.setString(3, type);
      psmt.setString(4, rank);
      int count=psmt.executeUpdate();
      if(count>0) {
        System.out.println("Data inserted done");
      }else {
        System.out.println("Data inserted failed");
      }
      con.close();
      psmt.close();
    } catch (ClassNotFoundException | SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
  
//  UPDATE METHOD
  public static void update() {
    @SuppressWarnings("resource")
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter id:");
    int id=scn.nextInt();
    System.out.println("Enter name:");
    String name=scn.next();
    System.out.println("Enter type:");
    String type=scn.next();
    System.out.println("Enter rank:");
    String rank=scn.next();
    
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      String dburl="jdbc:mysql://localhost:3306/network?user=root&password=root";
      Connection con=DriverManager.getConnection(dburl);
      String query="UPDATE SERVICE_PROVIDER SET NAME=?,TYPE=?,RANK_NO=? WHERE ID=?";
      PreparedStatement psmt=con.prepareStatement(query);
      psmt.setString(1, name);
      psmt.setString(2, type);
      psmt.setString(3, rank);
      psmt.setInt(4, id);
      int count=psmt.executeUpdate();
      if(count>0) {
        System.out.println("Data update done");
      }else {
        System.out.println("Data update failed");
      }
      con.close();
      psmt.close();
    } catch (ClassNotFoundException | SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
// DELETE METHOD
  public static void delete() {
    @SuppressWarnings("resource")
    Scanner scn =new Scanner(System.in);
    System.out.println("Enter id to delete the data");
    int id =scn.nextInt();
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      String dburl="jdbc:mysql://localhost:3306/network?user=root&password=root";
      Connection con=DriverManager.getConnection(dburl);
      String query="DELETE FROM SERVICE_PROVIDER WHERE ID=?";
      PreparedStatement psmt=con.prepareStatement(query);
      psmt.setInt(1, id);
      int count=psmt.executeUpdate();
      if(count>0) {
    	  System.out.println("Data delete done");
      }else {
        System.out.println("Data delete failed");
      }
      con.close();
      psmt.close();
    } catch (ClassNotFoundException | SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    
  }
//  SELECT METHOD WITHOUT CONDITION
  public static void select() {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      String dburl="jdbc:mysql://localhost:3306/network?user=root&password=root";
      Connection con =DriverManager.getConnection(dburl);
      String query="SELECT * FROM SERVICE_PROVIDER";
      PreparedStatement psmt=con.prepareStatement(query);
      ResultSet rs=psmt.executeQuery();
      System.out.println("-------SERVICE PROVIDER TABLE DATA---------");
      System.out.println("ID\t NAME\t TYPE\t RANK_NO\t");
      System.out.println("------------------------------------------");
      while(rs.next()) {
        int id=rs.getInt(1);
        String name=rs.getString(2);
        String type=rs.getString(3);
        int rank_no=rs.getInt(4);
        System.out.println(id+"\t"+name+"\t"+type+"\t\t"+rank_no+"\t");
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