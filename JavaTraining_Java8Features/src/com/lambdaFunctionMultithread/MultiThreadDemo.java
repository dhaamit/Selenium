package com.lambdaFunctionMultithread;

public class MultiThreadDemo implements Runnable{

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		MultiThreadDemo r = new MultiThreadDemo();
		Thread t = new Thread(r);
		t.start();
		for (int i=0;i<=10;i++)
		{
			System.out.println("Main Thread...");
			Thread.sleep(1000);
		}

	}

	@Override
	public void run() {
		for (int i=0;i<=10;i++)
		{
			System.out.println("Child Thread...");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
