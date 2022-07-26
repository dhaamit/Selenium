package com.lambdaFunctionsInMultithreading;

public class AnonymousClassWoL {

	public static void main(String [] args)
	{
	Runnable r= new Runnable(){
		public void run(){
			for(int i=1;i<=10;i++){
				System.out.println("child Thread...");
			}
		}
	};
	Thread t=new Thread(r);
	t.start();
	for(int i=1;i<=10;i++){
		System.out.println("main Thread...");
	}
	}
}
