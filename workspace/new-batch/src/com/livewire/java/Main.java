package com.livewire.java;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		user u1=new user();
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter Your choice: ");
		System.out.println("Press 1 To Login: ");
		System.out.println("Press 2 To sigin: ");
		int choice=scn.nextInt();
		if(choice==1) {
			user.login();
			
		}
		else if(choice==2) {
			System.out.println("Press 2 To sigin: ");
		}else {
			System.out.println("invaild choice");
		}
		

	}

}
