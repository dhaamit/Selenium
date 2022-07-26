package interfaceExample;

public class ICICIBank implements RBI {

	@Override
	public void minBalanceInSavings() {
		System.out.println("Minimum Balance in Savings need to be 5000");
		
	}

	@Override
	public void minBalanceInCurrent() {
		System.out.println("Minimum Balance in Current need to be 500");		
	}

	@Override
	public void roi() {
		System.out.println("Return on Investment need to be 5%");		
	}

	public void internationalBanking()
	{
		System.out.println("This is Additional Feature provided by ICICI Bank");
	}
}
