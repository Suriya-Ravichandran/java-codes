package complietimepolymorphism;
import java.util.Scanner;
public class phonemain {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		Phoneunlockfeature p1 =new Phoneunlockfeature();
		System.out.println("1.swiping to unlock\n2.pin to unlock\n3.password to unlock");
		System.out.print("Enter Your choice:");
		int choice =scn.nextInt();
		switch(choice) {
		case 1:p1.unlock();
		break;
		case 2:System.out.print("Enter pin:");
		int pin=scn.nextInt();
		p1.unlock(pin);
		break;
		case 3:System.out.print("Enter password:");
		String pwd=scn.next();
		p1.unlock(pwd);
		break;
		}
	}
}
