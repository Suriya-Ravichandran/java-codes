package com.jspiders.emp_app.dao;

import java.util.Scanner;

import com.jspiders.emp_app.dto.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeDao {

	static Scanner sc =new Scanner(System.in);
	
	public static void insertEmployee() {
	    
	    
	    boolean continueInserting = true;

	    while (continueInserting) {
	        Employee employee = new Employee();
	        
	        System.out.println("Enter EmpId");
	        employee.setEmployeeNumber(sc.nextInt());
	        
	        System.out.println("Enter EmpName");
	        employee.setEmployeeName(sc.next());
	        
	        System.out.println("Enter EmpJob");
	        employee.setDesignation(sc.next());
	        
	        System.out.println("Enter EmpMGR");
	        employee.setManagerNumber(sc.nextInt());
	        
	        System.out.println("Enter EmpHiredate");
	        employee.setHireDate(sc.next());
	        
	        System.out.println("Enter EmpSalary");
	        employee.setSalary(sc.nextDouble());
	        
	        System.out.println("Enter EmpComm");
	        employee.setCommission(sc.nextDouble());
	        
	        System.out.println("Enter EmpDeptNo");
	        employee.setDepartmentNo(sc.nextInt());
	        
	        EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
		    EntityManager manager = factory.createEntityManager();
	        EntityTransaction transaction = manager.getTransaction();
	        transaction.begin();
	        manager.persist(employee);
	        transaction.commit();
	        
	        System.out.println("DATA INSERT SUCCESSFULLY");
	        
	       // add more data
	        System.out.println("Do you want to insert another employee? (yes/no)");
	        String response = sc.next();
	        continueInserting = response.equalsIgnoreCase("yes");
	    }
	    
	}

	
// find Employee method
	public static void findEmployee() {
		
	}
	
//	update Employee method
	public static void updateEmployee() {
		
	}
	
//	Delete Employee method
	public static void deleteEmployee() {
		
	}
}
