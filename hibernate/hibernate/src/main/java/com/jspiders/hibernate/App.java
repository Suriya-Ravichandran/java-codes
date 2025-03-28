package com.jspiders.hibernate;

import java.util.Scanner;

import com.jspiders.hibernate.dao.EmployeeDao;

public class App{
    public static void main(String[] args){
    	 @SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
         int num;
         System.out.println("ENTER \n 1 TO INSERT\n 2 TO SELECT\n 3 TO UPDATE\n 4 TO DELETE");
         num = scn.nextInt();
         switch (num) {
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
        
    }
}
