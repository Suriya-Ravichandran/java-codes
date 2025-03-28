import java.util.Scanner;
class Task4{
	public static void m1(int n){
		System.out.println("Result");
		for(int i=1;i<=n;i++){
			if(i%4==0){
				System.out.println(i);
			}
		}
	}
}
class Mainoftask4{
	public static void main(String[] args){
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the n value");
	int n= scn.nextInt();
	Task4.m1(n);
	}
}