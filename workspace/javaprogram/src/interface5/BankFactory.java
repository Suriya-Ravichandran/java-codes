package interface5;
public class BankFactory {
	public void get(Bank b) {
		if(b instanceof HfdcBank) {
			HfdcBank t1=(HfdcBank)b;
			t1.amount();
			t1.roi();
			t1.tenure();
		}
		else if(b instanceof IndianBank) {
			IndianBank P1=(IndianBank)b;
			P1.amount();
			P1.roi();
			P1.tenure();
		}
		else if(b instanceof ICICIBank) {
			ICICIBank I1=(ICICIBank)b;
			I1.amount();
			I1.roi();
			I1.tenure();
		}
		else {
			IDFCBank h1=(IDFCBank)b;
			h1.amount();
			h1.roi();
			h1.tenure();
		}
	}
}
