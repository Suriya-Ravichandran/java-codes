class Instagramv1{
	public void login(){
		System.out.println("Login Done...");
	}
	public void reels(){
		System.out.println("30 sec reels uploaded...");
	}
	public void sharePost(){
		System.out.println("Share post via Instagram..");
	}
	public void message(){
		System.out.println("Message sent/Recieved..");
	}
	public void like(){
		System.out.println("Like Done..");
	}
	public void logout(){
		System.out.println("Logout Done...");
	}
}
class Instagramv2 extends Instagramv1{
	@Override
	public void reels(){
		System.out.println("90 sec reels uploaded...");
	}
	@Override
	public void sharePost(){
		System.out.println("Instagram/Whatsapp/gmail/twitter...");
	}
}
class MainofInstagram{
	public static void main(String[] args){
		System.out.println("Instagram Version1");
		System.out.println("------------------");
		Instagramv1 ig1=new Instagramv1();
		ig1.login();
		ig1.reels();
		ig1.sharePost();
		ig1.message();
		ig1.like();
		ig1.logout();
		System.out.println("Instagram Version2");
		System.out.println("------------------");
		Instagramv2 ig2=new Instagramv2();
		ig2.login();
		ig2.reels();
		ig2.sharePost();
		ig2.message();
		ig2.like();
		ig2.logout();
	}
}