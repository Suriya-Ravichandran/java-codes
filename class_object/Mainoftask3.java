import java.util.Scanner;
class Task3{
	public static void m1(int n){
		System.out.println("Result");
		for(int i=n;i>=1;i--){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
}
class Mainoftask3{
	public static void main(String[] args){
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the n value");
	int n= scn.nextInt();
	Task3.m1(n);
	}
}