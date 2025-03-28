package interface3;

public class mssql implements database {

	@Override
	public void connect() {
		System.out.println("Mssql is connect");	
		
	}

	@Override
	public void disconnect() {
		System.out.println("Mssql is disconnect");	
	}

}
