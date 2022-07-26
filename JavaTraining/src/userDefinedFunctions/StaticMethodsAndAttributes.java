package userDefinedFunctions;

public class StaticMethodsAndAttributes {
	
	String models;
	int price;
	static int wheels = 4;
	
	public static void test()
	{
		System.out.println("Static Method");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("No of wheels ="+wheels);
		test();
	}

}
