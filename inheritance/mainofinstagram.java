class instagramv1{
	public void login(){
		System.out.println("Login success");
	}
	public void message(){
		System.out.println("message sending");
	}
	public void like(){
		System.out.println("Like updated");
	}
	public void reels(){
		System.out.println("reels uploaded");
	}
	public void logout(){
		System.out.println("logout success");
	}
}
class instagramv2 extends instagramv1{
	public void sharepost(){
		System.out.println("post uploaded successfully");
	}
	public void uploadedpost(){
		System.out.println("upload your post here");
	}
}
class mainofinstagram{
	public static void main(String[] args){
	System.out.println("----insta version 1---");
	instagramv1 in1=new instagramv1();
	in1.login();
	in1.message();
	in1.like();
	in1.reels();
	in1.logout();
	System.out.println("----insta version 2---");
	instagramv2 in2=new instagramv2();
	in2.login();
	in2.message();
	in2.like();
	in2.reels();
	in2.sharepost();
	in2.uploadedpost();
	in2.logout();
	}
}