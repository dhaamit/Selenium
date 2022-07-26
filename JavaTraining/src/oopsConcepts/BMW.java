package oopsConcepts;

public class BMW extends Car{
	
	public BMW()
	{
		super.model="BMW";
		Car c= new Car(super.model);
		System.out.println("This is BMW constructor.."+c.model);
	}
	public void start()
	{
		System.out.println("BMW has its own way of starting..");
	}
	public void safetySetting()
	{
		System.out.println("Theft Safety  is special feature in BMW");
	}
}
