package com.jspiders.hibernate.dao;



import java.util.Scanner;

import com.jspiders.hibernate.dto.Employee;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class EmployeeDao {
	    
	static Scanner sc =new Scanner(System.in);
	public static void insertEmployee() {
	     Employee employee =new Employee();
	     System.out.println("Enter EmpID");
	     employee.setEmployeeId(sc.nextInt());
	     System.out.println("Enter Empname");
	     employee.setEmployeeName(sc.next());
	     System.out.println("Enter Empdept");
	     employee.setDepartment(sc.next());
	     System.out.println("Enter Empage");
	     employee.setAge(sc.nextInt());
	     System.out.println("Enter Empphone");
	     employee.setPhone(sc.nextLong());
	     System.out.println("Enter Empsalary");
	     employee.setSalary(sc.nextDouble());
	     EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
	     EntityManager manager = factory.createEntityManager();
//	     //persist(object) insert the record in table
//	     //remove(object) delete the record from table
//	     //find(<f>,object primary key) - it is used to fetch the data from table
	    EntityTransaction transaction = manager.getTransaction();
	    transaction.begin();
	    manager.persist(employee);
	    transaction.commit();
	}
	
	public static void findEmployee() {
		 System.out.println("Enter Employee Id:");
		 int empid=sc.nextInt();
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
	     EntityManager manager = factory.createEntityManager();
	     Employee employee = manager.find(Employee.class, empid);
	     System.out.println(employee);
	     System.out.println(employee.getEmployeeId());
	     System.out.println(employee.getEmployeeName());
	}
	
	public static void updateEmployee() {
		 System.out.println("Enter Employee Id:");
		 int empid=sc.nextInt();
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
	     EntityManager manager = factory.createEntityManager();
	     EntityTransaction transaction = manager.getTransaction();
	     Employee employee = manager.find(Employee.class, empid);
	     if(employee !=null) {
	     System.out.println("Enter new salary:");
	     employee.setSalary(sc.nextDouble());
	     transaction.begin();
	     manager.persist(employee);
	     transaction.commit();
	     }else {
	    	 System.out.println("invaild id");
	     }
	}
	
	public static void deleteEmployee() {
		System.out.println("Enter Employee Id:");
		 int empid=sc.nextInt();
		 EntityManagerFactory factory = Persistence.createEntityManagerFactory("development");
	     EntityManager manager = factory.createEntityManager();
	     EntityTransaction transaction = manager.getTransaction();
	     Employee employee = manager.find(Employee.class, empid);
	     if(employee !=null) {
	    	 transaction.begin();
	    	 manager.remove(employee);
	    	 transaction.commit();
	     }else {
	    	 System.out.println("Invaild");
	     }
	}

}
