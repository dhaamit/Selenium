package oopsConcepts;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BMW b = new BMW();
		b.start();
		b.stop();
		b.safetySetting();

		Car c = new BMW();
		c.start();
		c.stop();
//		c.safetySetting();XXXXX//Dont have access to methods from child class.
		
		BMW d = new BMW();
		d= (BMW) c; // reference typecasting
		d.safetySetting(); //Now this is allowed.
	}

}
