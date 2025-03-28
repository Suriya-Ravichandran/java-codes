package thread;

public class main extends Thread {
	
	public static int amount=0;

	public static void main(String[] args) {
		
		main t1 = new main();
		t1.start();
		
		while(t1.isAlive()) {
			System.out.println("waiting...");		
			
		}
		System.out.println(amount);
		for(int i=0;i<=10;i++) {
			amount++;
		}
		
		
		System.out.println(amount);

	}
	
	public void run() {
		amount++;
     }

}
