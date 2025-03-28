class Method{
	public static void m1(){
		System.out.println("hi");
	}
	public static void m1(int x){
		System.out.println("hi");
		System.out.println(x);
	}
	public static void m1(double x,boolean y){
		System.out.println("hi");
		System.out.println(x);
		System.out.println(y);
	}
}
class Methodofmain{
	public static void main(String[] args){
	Method.m1();
	Method.m1(10);
	Method.m1(10,true);
	}
}