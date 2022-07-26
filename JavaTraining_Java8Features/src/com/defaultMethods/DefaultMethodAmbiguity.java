package com.defaultMethods;

interface Left{
	default void m1() {
		System.out.println("Left interface");
	}
}

interface Right{
	default void m1() {
		System.out.println("Right interface");
	}
}

public class DefaultMethodAmbiguity implements Left,Right{

	public void m1() {
		Right.super.m1();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultMethodAmbiguity d=new DefaultMethodAmbiguity();
		d.m1();
	}

}
