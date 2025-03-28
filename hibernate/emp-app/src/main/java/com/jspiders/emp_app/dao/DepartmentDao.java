package com.jspiders.emp_app.dao;

import java.util.Scanner;

import com.jspiders.emp_app.dto.Department;


import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class DepartmentDao {
static Scanner sc =new Scanner(System.in);
	
	public static void insertDepartment() {
	    
	    
	    boolean continueInserting = true;

	    while (continueInserting) {
	        Department dept = new  Department();
	        
	        System.out.println("Enter DeptNo");
	        dept.setDepartmentNumber(sc.nextInt());
	        
	        System.out.println("Enter DeptName");
	        dept.setDepartmentName(sc.next());
	        
	        System.out.println("Enter DeptLoc");
	        dept.setDepartmentLocation(sc.next());
	        
	        EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
		    EntityManager manager = factory.createEntityManager();
	        EntityTransaction transaction = manager.getTransaction();
	        transaction.begin();
	        manager.persist(dept);
	        transaction.commit();
	        
	        System.out.println("DATA INSERT SUCCESSFULLY");
	        
	       // add more data
	        System.out.println("Do you want to insert another employee? (yes/no)");
	        String response = sc.next();
	        continueInserting = response.equalsIgnoreCase("yes");
	    }
	    
	}
	
	// find dept method
		public static void findDept() {
			
		}
		
//		update dept method
		public static void updateDept() {
			
		}
		
//		Delete dept method
		public static void deleteDept() {
			
		}
}
