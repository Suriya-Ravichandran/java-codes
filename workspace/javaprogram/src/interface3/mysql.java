package interface3;

public class mysql implements database {

	@Override
	public void connect() {
		System.out.println("Mysql is connect");		
	}

	@Override
	public void disconnect() {
		System.out.println("Mysql is disconnect");
		
	}

}
