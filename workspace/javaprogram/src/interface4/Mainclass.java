package interface4;
import java.util.Scanner;
public class Mainclass {
	public static void main(String[] args) {
	Scanner scn= new Scanner(System.in);
	Help h1=new Help();
	System.out.println("1.triangle\n2.Pendagon\n3.Hexagon");
	System.out.println("Please make a choices");
	int choice=scn.nextInt();
	switch(choice) {
	case 1:h1.get(new Triangle());
	break;
	case 2:h1.get(new Pendagon());
	break;
	case 3:h1.get(new Hexagon());
	break;
	default:System.out.println("invaild choice");
	}
	
    }
}
