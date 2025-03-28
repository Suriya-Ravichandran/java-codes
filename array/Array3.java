import java.util.Scanner;
class Array3{
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
			if(ch[i]=='A' || ch[i]=='a'
			   || ch[i]=='E' || ch[i]=='e'
			   || ch[i]=='I' || ch[i]=='i'
			   || ch[i]=='o' || ch[i]=='o'
			   || ch[i]=='u' || ch[i]=='u')
			   {
				System.out.println(ch[i]);
			}
		}
	}
}	