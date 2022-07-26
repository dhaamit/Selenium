package exceptionHandling;

public class uncaughtException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("A");
			System.out.println(8/0);
		}
		catch (Throwable e){
			System.out.println(e.getMessage());
			System.out.println("B");
		}
		System.out.println("C");
	}

}
