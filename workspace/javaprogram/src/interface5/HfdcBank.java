package interface5;

public class HfdcBank implements Bank {

	@Override
	public void amount() {
		System.out.println("Hdfc Bank will offer loan of amount 10L ");
	}

	@Override
	public void roi() {
		System.out.println("Hdfc Bank Rol is 14.5% ");
	}

	@Override
	public void tenure() {
		System.out.println("Hdfc Bank Tenure is 5 years ");
	}

}
