class AmazonVersion1{
	public void login(){
		System.out.println("Login Done...");
	}
	public void pay(){
		System.out.println("You can pay phone bill...");
	}
	public void shop(){
		System.out.println("you can do shopping...");
	}
	public void logout(){
		System.out.println("Logout Done...");
	}
}
class AmazonVersion2{
	@Override
	public void pay(){
		System.out.println("You can pay phone/gas/water bills..");
	}
	public void music(){
		System.out.println("you can Listen to Music...");
	}
	public void prime(){
		System.out.println("you can watch movies and Series...");
	}
}
class MainofAmazon{
	public static void main(String[] args){
	System.out.println("Amazon version 1");
	System.out.println("----------------");
	AmazonVersion1 am1=new AmazonVersion1();
	am1.login();
	am1.pay();
	am1.shop();
	am1.logout();
	System.out.println("Amazon version 2");
	System.out.println("----------------");
	AmazonVersion2 am2=new AmazonVersion2();
	am2.login();
	am2.pay();
	am2.shop();
	am2.music();
	am2.movies();
	am2.logout();
	}
}