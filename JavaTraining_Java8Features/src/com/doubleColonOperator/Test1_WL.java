package com.doubleColonOperator;
interface interf {
	public void m1();
}
public class Test1_WL {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interf i=() ->System.out.println("Minimum balance is 5000");
		i.m1();
	}

}
