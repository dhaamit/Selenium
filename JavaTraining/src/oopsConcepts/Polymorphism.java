package oopsConcepts;

public class Polymorphism {

	public void open ()
	{
		System.out.println("No Password");
	}
	public void open (String pwd)
	{
		System.out.println("Opened with String Password = "+pwd);
	}
	public void open (int pwd)
	{
		System.out.println("Opened with Integer Password ="+pwd);
	}
	public void open (String pwd, int num)
	{
		System.out.println("Opened with String "+pwd+" and Integer Combination "+num);
	}
	public void open (Object obj)
	{
		System.out.println("Opened with Password Object "+obj);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Polymorphism p = new Polymorphism();
		p.open(213123);
		p.open("Amit");
		p.open("xyz",123);
		p.open(23.45f);
	}

}
