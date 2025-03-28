import java.util.Scanner;
class Array1{
	public static void main(String[] args){
		intarrayodd();
	}
	// find odd number
	public static void intarrayodd(){
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter value");
		int size=scn.nextInt();
		
		// create array
		int[] a1= new int[size];
		
		//insert value 
		System.out.println("Enter values");
		for(int i=0;i<size;i++){
		a1[i]=scn.nextInt();
		}
		
		//operation
		System.out.println("result");
		for(int i=0;i<size;i++){
			if(a1[i]%2!=0){
				System.out.println(a1[i]);
			}
		}
	}
}