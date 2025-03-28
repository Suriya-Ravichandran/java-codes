package ObjectClassEx1;

public class bikeofmain {

	public static void main(String[] args) {
		Bike b1=new Bike("Honda","black",1000,2010);
		Bike b2=new Bike("yamaha","blue",2000,2011);
		Bike b3=new Bike("dio","yellow",3000,2010);
		Bike b4=new Bike("rx100","black",3000,2020);
		System.out.println(b1.hashCode());
		System.out.println(b2.hashCode());
		System.out.println(b3.hashCode());
		System.out.println(b4.hashCode());
		System.out.println("---------------------");
		System.out.println("name color price yom");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println("---------------------");
		System.out.println(b1.equals(b2));
		System.out.println(b4.equals(b3));
		
	}

}
