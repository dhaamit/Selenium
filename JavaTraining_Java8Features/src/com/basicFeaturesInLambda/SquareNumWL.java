package com.basicFeaturesInLambda;

interface Squarenum{
	public void m1(int i);
}
public class SquareNumWL {

	public static void main(String[] args) {
		Squarenum s=(i)->System.out.println("Square of "+i+" is "+(i * i));
		s.m1(3);
	}

}
