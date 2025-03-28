class Bike{
	String name;
	double price;
	String year_of_model;
	String brand;
	public Bike(String A,double B,String C,String D){
		name=A;
		price=B;
		year_of_model=C;
		brand=D;
	}
}
class Mainofbike{
	public static void main(String[] agrs){
		System.out.println("NAME\t \t"+"Price\t"+"YEAR OF MODEL\t"+"BRAND");
		System.out.println("--------------------------------------------");
		Bike b1=new Bike("Hero splender",74.000,"03.07.2024","Hero");
		Bike b2=new Bike("R15 V3",100.000,"04.07.2024","Yamaha");
		Bike b3=new Bike("CT100",60.000,"05.07.2024","Bajaji");
		Bike b4=new Bike("pulsar 220",120.000,"03.07.2024","Bajaji");
		System.out.println(b1.name+"\t"+b1.price+"\t"+b1.year_of_model+"\t"+b1.brand);
		System.out.println(b2.name+"\t\t"+b2.price+"\t"+b2.year_of_model+"\t"+b2.brand);
		System.out.println(b3.name+"\t\t"+b3.price+"\t"+b3.year_of_model+"\t"+b3.brand);
		System.out.println(b4.name+"\t"+b4.price+"\t"+b4.year_of_model+"\t"+b4.brand);
	}
}