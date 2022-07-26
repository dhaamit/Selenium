package oopsConcepts;

public class Constructor {
	//Rule1 : Constructor should NOT be static
	//Rule2 : Constructor should NOT have return type
	
	public Constructor()
	{
		System.out.println("inside construction - Default");
	}
	public Constructor(int x)
	{
		System.out.println("inside construction - Parametrized Integer = "+x);
	}
	public Constructor(Object x)
	{
		System.out.println("inside construction - Parametrized Object = "+x);
	}
	public Constructor(String x)
	{
		System.out.println("inside construction - Parametrized String = "+x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Constructor();
		new Constructor(563);
		new Constructor("ok");
		new Constructor(4343.45f);		
	}

}
