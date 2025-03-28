package interface5;

public class ICICIBank implements Bank{
	@Override
	public void amount() {
		System.out.println("ICICI Bank will offer loan of amount 10L ");
		
	}

	@Override
	public void roi() {
		System.out.println("ICICI Bank Rol is 14.5% ");
	}

	@Override
	public void tenure() {
		System.out.println("ICICI Bank Tenure is 5 years ");
	}

}
