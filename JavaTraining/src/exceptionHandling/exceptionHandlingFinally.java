package exceptionHandling;

public class exceptionHandlingFinally {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Open DB");
		try {
			System.out.println(8/0);
		}
		catch(Throwable t)
		{
			System.out.println(8/0);
		}
		finally
		{
			System.out.println("Close DB");
		}
	}
}
