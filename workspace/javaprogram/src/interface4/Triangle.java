package interface4;

public class Triangle implements shape {

	@Override
	public void side() {
		System.out.println("Triangle is having 3 sides");
	}

	@Override
	public void color() {
		System.out.println("Triangle is red color");
	}

}
