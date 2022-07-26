package com.basicFeaturesInLambda;

interface Interf{
	public void m1();
}
public class WithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interf i=()->System.out.println("Hello Java");
		i.m1();
	}

}
