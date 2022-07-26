package vehicle;

public class BMW extends Car{

	public BMW() 
	{
		super.type="Car";
		super.setMake("BMW");
		System.out.println("Make : " + super.getMake());
	}
}
