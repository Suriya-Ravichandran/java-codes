package interface3;

public class oracle implements database {

	@Override
	public void connect() {
		System.out.println("oracle is connect");	
		
	}

	@Override
	public void disconnect() {
		System.out.println("oracle is disconnect");	
		
	}

}
