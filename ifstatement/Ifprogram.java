import java.util.Scanner;
class Ifprogram{
	public static void main(String[] args){
	int num1,num2;
	Scanner s=new Scanner(System.in);
	num1 = s.nextInt();
	num2 = s.nextInt();
	if(num1>num2){
		System.out.println("Num1 is larger");
	}
	else{
		System.out.println("Num2 is larger");
	}
  }
}