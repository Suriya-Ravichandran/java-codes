package com.jspiders.emp_app;

import java.util.Scanner;

import com.jspiders.emp_app.dao.DepartmentDao;
import com.jspiders.emp_app.dao.EmployeeDao;

public class App {
    public static void main(String[] args) {
    	 @SuppressWarnings("resource")
 		  Scanner scn = new Scanner(System.in);
          int num;
          System.out.println("PRESS 1 TO EMP");
          System.out.println("PRESS 2 TO DEPT");
          System.out.println("ENTER YOUR CHOICE");
          num = scn.nextInt();
          if(num==1) {
        	  int empDB;
        	  System.out.println("ENTER YOUR CHOICE");
        	  System.out.println(" 1 TO INSERT \n 2 TO FIND \n 3 TO UPDATE \n 4 TO DELETE \n");
        	  empDB=scn.nextInt();
	          switch (empDB) {
	              case 1:
	             	 EmployeeDao.insertEmployee();
	                  break;
	              case 2:
	                  EmployeeDao.findEmployee();
	                  break;
	              case 3:
	                  EmployeeDao.updateEmployee();
	                  break;
	                  
	              case 4:
	             	 EmployeeDao.deleteEmployee();
	             	 break;
	              case 5:
	                  System.out.println("Exiting...");
	                  return;
	              default:
	                  System.out.println("Make a correct choice...!");
	          }
          
         }else {
        	 int deptDB;
        	 System.out.println("ENTER YOUR CHOICE");
       	     System.out.println(" 1 TO INSERT \n 2 TO FIND \n 3 TO UPDATE \n 4 TO DELETE \n");
        	 deptDB=scn.nextInt();
        	 switch (deptDB) {
             case 1:
            	 DepartmentDao.insertDepartment();
                 break;
             case 2:
            	 DepartmentDao.findDept();
                 break;
             case 3:
            	 DepartmentDao.updateDept();
                 break;
                 
             case 4:
            	 DepartmentDao.deleteDept();
            	 break;
             case 5:
                 System.out.println("Exiting...");
                 return;
             default:
                 System.out.println("Make a correct choice...!");
         }
        	 
         }
    }  
}
