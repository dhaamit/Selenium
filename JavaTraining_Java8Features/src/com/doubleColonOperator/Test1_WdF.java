package com.doubleColonOperator;
interface InterfWd{
	public void m1();
}
public class Test1_WdF {

	public static void m2() {
		System.out.println("minimum balance is 5000");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfWd i=Test1_WdF :: m2;
		i.m1();
	}

}
