import java.util.Scanner;
class payment{
	public void Payment(){
		System.out.println("Cash on Delivary");
	}
	public void Payment(String UPI){
		System.out.println("Payment Via UPI Sucessfully");
		System.out.println("paided by:"+UPI);
	}
	public void Payment(long card_no,int cvc){
		System.out.println("Payment Via card payment Sucessfully");
		System.out.println("paided by:"+card_no);
	}
	public void Payment(String username,String password){
		System.out.println("Payment Via username password Sucessfully");
		System.out.println("paided by:"+username);
	}
}
class Mainofpayment{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		payment p=new payment();
		System.out.println("1.cash on delivary\n2.upi\n3.card\n.username and password");
		System.out.print("Enter choice:");
		int choice=scn.nextInt();
		switch(choice){
			case 1:p.Payment();
				   break;
			case 2:System.out.println("Enter the UPI ID");
				   String UPI=scn.next();
				   p.Payment(UPI);
				   break;
			case 3:System.out.println("Enter the card_no");
				   long card_no=scn.nextInt();
				   System.out.println("Enter the cvc");
				   int cvc=scn.nextInt();
				   p.Payment(card_no,cvc);
				   break;
			case 4:System.out.println("Enter the Username");
				   String Username=scn.next();
				   System.out.println("Enter the password");
				   String password=scn.next();
				   p.Payment(Username,password);
				   break;
			default:System.out.println("Invaild choice");
		}
		
	}
}