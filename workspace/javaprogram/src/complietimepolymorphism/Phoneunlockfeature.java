package complietimepolymorphism;

public class Phoneunlockfeature {
	public void unlock() {
		System.out.println("Phone unlocked successfully by swiping!!!");
	}
	public void unlock(int pin) {
		System.out.println("Phone unlocked successfully by pin!!!");
	}
	public void unlock(String password) {
		System.out.println("Phone unlocked successfully by password!!!");
	}
	
}
