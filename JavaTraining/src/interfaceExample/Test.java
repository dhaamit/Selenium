package interfaceExample;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ICICIBank r = new ICICIBank();
		RBI r = new ICICIBank();
		r.minBalanceInCurrent();
		r.minBalanceInSavings();
		r.roi();
		//r.internationalBanking(); //This is accessible only if ICICIBank object is created. Not for RBI object
	}

}
