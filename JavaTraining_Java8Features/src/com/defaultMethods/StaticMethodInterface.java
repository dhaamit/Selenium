package com.defaultMethods;
interface interstatic{
	public static void payment() {
		System.out.println("credit card payment..");
	}
}
public class StaticMethodInterface {
	public static void main(String[] args) {
		interstatic.payment();
	}
}
