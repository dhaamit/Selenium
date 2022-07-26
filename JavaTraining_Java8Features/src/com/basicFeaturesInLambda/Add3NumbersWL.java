package com.basicFeaturesInLambda;

interface Sum{
	public int sum(int a, int b, int c);
}

public class Add3NumbersWL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sum sum=(a,b,c)->a+b+c;
		int sum2 = sum.sum(10,20,30);
		System.out.println("Sum is "+sum2);
	}
}

