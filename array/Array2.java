import java.util.Scanner;
class Array2{
	public static void main(String[] args){
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter Size of Array");
		int size=scn.nextInt();
		
		// create array
		char[] ch= new char[size];
		System.out.println("Enter value");
		for(int i=0; i<size; i++){
			ch[i]=scn.next().charAt(0);
		}
		System.out.println("Result");
		for(int i=0;i<size;i++){
			if(ch[i]>='a' && ch[i]<='z')
			{
				System.out.println(ch[i]);
			}
		}
	}
}