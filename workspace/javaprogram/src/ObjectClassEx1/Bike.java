package ObjectClassEx1;

public class Bike {
	String name;
	String color;
	int price;
	int yom;
	
	public Bike(String name,String color,int price,int yom) {
		this.name=name;
		this.color=color;
		this.price=price;
		this.yom=yom;
	}
	@Override
	public int hashCode() {
		return this.yom;
	}
	@Override
	public String toString() {
		return this.name+" "+this.color+" "+this.price+" "+this.yom;
	}
	@Override
	public boolean equals(Object obj) {
		Bike b=(Bike)obj;
		return this.price==b.price;
	}
}
