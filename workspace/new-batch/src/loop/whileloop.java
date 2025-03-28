package loop;
import java.util.Scanner;
public class whileloop {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		while(true) {
		System.out.println("Enter your choice: ");
		int choice=scn.nextInt();
		if(choice==1) {
			System.out.println("RED");
		}
		else if(choice==2) {
			System.out.println("YELLOW");
		}
		else if(choice==3) {
			System.out.println("GREEN");
		}
		else {
			System.out.println("Exit....");
			scn.close();
			break;
		}
		
	  }
	}

}
