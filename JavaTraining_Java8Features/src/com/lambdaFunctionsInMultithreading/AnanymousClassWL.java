package com.lambdaFunctionsInMultithreading;

public class AnanymousClassWL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t=new Thread(()->{
			for(int i=1;i<=10;i++){
			System.out.println("Child Thread...");
		}
		});
		t.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main thread ..");
		}
	}

}
