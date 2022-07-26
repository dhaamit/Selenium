package userDefinedFunctions;

public class AddNumbers {

	public static void main(String[] args) {
		int a =10;
		int b=20;
		System.out.println("A");
		int c = sum(a,b) +50;
		System.out.println("Total Sum = " + c);
		
	}
	
	public static int sum(int x, int y)
	{
		int z = x+y;
		return z;
//		System.out.println("Sum of numbers is = "+z);
	}

}
