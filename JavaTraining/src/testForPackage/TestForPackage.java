package testForPackage;

import oopsConcepts.BMW;
import oopsConcepts.Car;
import userDefinedFunctions.Test1;

public class TestForPackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("BMW");
		c.start();
		Test1.login();
		System.out.println(Test1.name);
		
		BMW b = new BMW();
		b.safetySetting(); //Now this is allowed.
	}

}
