package com.livewire.java;
import java.util.Scanner;
public class user {
	static Scanner scn =new Scanner(System.in);
	
//	login operation
	public static void login() {
		System.out.println("Enter user name: ");
		String username=scn.next();
		System.out.println("Enter your password: ");
		String password=scn.next();
		String defaultpassword="Suriya@123";
		if(password.equals(defaultpassword)) {
			System.out.println("Login success "+ username);
		}else {
			System.out.println("Login failed");
		}
	}
	
//	signin operation

}
