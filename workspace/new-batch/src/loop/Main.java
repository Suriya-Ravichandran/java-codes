package loop;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		while(true) {
		System.out.println("press 1 to Red\npress 2 to Yellow\npress 3 to Green");
		System.out.print("Enter your choice:");
		int choice=scn.nextInt();
		
		if(choice==1) {
			System.out.println("Red");
		}
		else if(choice==2) {
			System.out.println("yellow");
		}
		else if(choice==3) {
			System.out.println("Green");
		}
		else {
			System.out.println("exit.....");
			scn.close();
			break;
		}
		
		}
	}

}
