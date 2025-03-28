import java.util.Scanner;
class Task2{
	public static void m1(int n){
		System.out.println("Result");
		for(int i=1;i<=n;i++){
			if(i%2!=0){
				System.out.println(i);
			}
		}
	}
}
class Mainoftask2{
	public static void main(String[] args){
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the n value");
	int n= scn.nextInt();
	Task2.m1(n);
	}
}