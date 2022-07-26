package encapsulationExample;

public class user1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAccount m = new MyAccount();

		m.setFname("Amitabh");
		m.setLname("Bacchan");
		m.setAccountNumber(1234234);

		System.out.println(m.getFname());
		System.out.println(m.getLname());
		System.out.println(m.getAccountNumber());

	}

}
