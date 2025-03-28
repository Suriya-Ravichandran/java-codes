package loop;
import java.util.Scanner;
public class forloop {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter loop times:");
		int times=scn.nextInt();
		
		for(int i=0;i<=times;i++) {
			System.out.println("Hello World "+i+" times");
		}
		
		scn.close();

	}

}
