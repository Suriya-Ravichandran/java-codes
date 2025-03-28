package interface5;
import java.util.Scanner;
public class Mainclass {
	public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	BankFactory h1=new BankFactory();
	System.out.println("1.HDFC\n2.INDIANBANK\n3.ICICIBANK\nIDFCBANK\n");
	System.out.print("Please  choose the bank:");
	int choice=scn.nextInt();
	switch(choice) {
	case 1:h1.get(new HfdcBank());
	break;
	case 2:h1.get(new IndianBank());
	break;
	case 3:h1.get(new ICICIBank());
	break;
	case 4:h1.get(new IDFCBank());
	break;
	default:System.out.println("invaild choice");
	}
	
    }
}
