package com.basicFeaturesInLambda;

interface Stringlen1{
	public int m1(String s);
}

public class LengthOfAStringWL {

	public static void main(String[] args) {
		Stringlen1 i=s->s.length();
		int m1 = i.m1("RamRamRam");
		System.out.println("Length of a string is "+m1);
	}

}
