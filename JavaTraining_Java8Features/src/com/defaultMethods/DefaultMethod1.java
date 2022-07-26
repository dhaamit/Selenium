package com.defaultMethods;

interface interdefault{
	default void m1() {
		System.out.println("Default method implementation");
	}
}
public class DefaultMethod1 implements interdefault{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethod1 d = new DefaultMethod1();
		d.m1();
	}

}
