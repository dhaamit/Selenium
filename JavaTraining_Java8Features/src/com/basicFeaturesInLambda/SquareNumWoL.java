package com.basicFeaturesInLambda;

interface Square{
	public void m1(int i);
}
class DemoSquare implements Square{

	@Override
	public void m1(int i) {
		// TODO Auto-generated method stub
		System.out.println("Square of "+i+ " is "+(i*i));
	}
	
}
public class SquareNumWoL {
	public static void main(String[] args)
	{
		Square s=new DemoSquare();
		s.m1(3);
	}
}
