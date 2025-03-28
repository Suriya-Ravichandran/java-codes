import java.util.Scanner;
class Trainsearch{
	public void search(int no){
		System.out.println("Train search via Train name Successfully");
		System.out.println(no+":Train is available");
	}
	public void search(String name){
		System.out.println("Train search via Train name Successfully");
		System.out.println(name+":Train is available");
	}
}
class MainofTrainsearch{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		Trainsearch ts=new Trainsearch();
		System.out.println("1.Search Train via NO\n2.Search Train via Name");
		int choice=scn.nextInt();
		switch(choice){
			case 1:System.out.println("Enter the Train no");
				   int no=scn.nextInt();
				   ts.search(no);
				   break;
			case 2:System.out.println("Enter the Train name");
				   String name=scn.next();
				   ts.search(name);
				   break;
			default:System.out.println("Invaild choice");
		}
		
	}
}