package com.basicFeaturesInLambda;

interface Stringlen{ 
	public int m1(String s);
}
public class LengthOfStringWoL implements Stringlen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringlen i=new LengthOfStringWoL();
		int m1 = i.m1("RamRamRam");
		System.out.println("Length of the string is "+m1);
	}

	public int m1(String s)
	{
		
			return s.length();
		
	}
}
