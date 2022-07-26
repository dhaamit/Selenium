package oopsConcepts;

public class Car {
	String model;
	int price;
	//Explanation of this keyword.
	public Car(String model, int price)
	{
		this();
		this.model=model;
		this.price=price;
		System.out.println("Model = "+this.model+"; Price = "+this.price);
	}
	public Car(int price)
	{
		this.price=price;
		System.out.println("Model = "+this.model+"; Price = "+this.price);
	}
	public Car(String model)
	{
		this.model=model;
		System.out.println("Car Model is "+this.model);
	}
	public Car()
	{
		System.out.println("Car Constructor model is  " + this.model);
	}
	public void start()
	{
		System.out.println("car starts..");
	}
	public void stop()
	{
		System.out.println("car stops..");
	}

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * // Car c = new Car("BMW",20000); // System.out.println(c.model); //
	 * System.out.println(c.price);
	 * 
	 * new Car("BMW",20000); }
	 */

}
