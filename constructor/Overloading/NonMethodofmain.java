class NonMethod{
	public  void m1(){
		System.out.println("hi");
	}
	public  void m1(int x){
		System.out.println("hi");
		System.out.println(x);
	}
	public  void m1(double x,boolean y){
		System.out.println("hi");
		System.out.println(x);
		System.out.println(y);
	}
}
class NonMethodofmain{
	public static void main(String[] args){
	NonMethod non=new NonMethod();
	non.m1();
	non.m1(10);
	non.m1(10,true);
	}
}