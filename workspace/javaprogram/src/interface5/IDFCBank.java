package interface5;

public class IDFCBank implements Bank {
	@Override
	public void amount() {
		System.out.println("IDFC Bank will offer loan of amount 10L ");
		
	}

	@Override
	public void roi() {
		System.out.println("IDFC Bank Rol is 14.5% ");
	}

	@Override
	public void tenure() {
		System.out.println("IDFC Bank Tenure is 5 years ");
	}

}
