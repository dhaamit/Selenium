package basics;

public class Car {
	String Model;
	int price;
	int wheels;
	
	public static void main(String[] args) {
	Car a = new Car();
	
	a.Model = "BMW";
	a.price = 20000;
	a.wheels = 4;
	
	System.out.println("Model of car is "+a.Model);
	System.out.println("Price = "+a.price);
	System.out.println("Wheels = "+a.wheels);
		
		
	}

}
