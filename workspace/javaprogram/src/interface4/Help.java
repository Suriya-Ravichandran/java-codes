package interface4;

public class Help {
	public void get(shape s) {
		if(s instanceof Triangle) {
			Triangle t1=(Triangle)s;
			t1.side();
			t1.color();
		}
		else if(s instanceof Pendagon) {
			Pendagon P1=(Pendagon)s;
			P1.side();
			P1.color();
		}
		else {
			Hexagon h1=(Hexagon)s;
			h1.side();
			h1.color();
		}
	}
}
