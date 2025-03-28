import java.util.Scanner;
class Facebook{
	public void login(String email, String pwd){
		System.out.println("Login done via Email");
	}
		public void login(Long Phone, String pwd){
		System.out.println("Login done via Phone no");
	}
}
class MainofFacebook{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		Facebook fb=new Facebook();
		System.out.println("1.Login via Email\n2.Login via Phone no");
		int choice=scn.nextInt();
		switch(choice){
			case 1:System.out.println("Enter the Email");
				   String Email=scn.next();
				   System.out.println("Enter the Password");
				   String Pwd1=scn.next();
				   fb.login(Email,Pwd1);
				   break;
			case 2:System.out.println("Enter the Phone no");
				   long Phone=scn.nextLong();
				   System.out.println("Enter the Password");
				   String Pwd=scn.next();
				   fb.login(Phone,Pwd);
				   break;
			default:System.out.println("Invaild choice");
		}
		
	}
}