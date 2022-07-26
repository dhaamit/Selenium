package com.doubleColonOperator;

public class MultiThreadWdo1 {
	public static void m1() {
		for (int i=0;i<=10;i++)
		{
			System.out.println("child thread...");
	
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=MultiThreadWdo1 :: m1;
		Thread t=new Thread(r);
		t.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main thread...");
		}
	}

}
