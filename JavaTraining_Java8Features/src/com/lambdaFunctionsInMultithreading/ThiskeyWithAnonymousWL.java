package com.lambdaFunctionsInMultithreading;

interface Int1{
	public void m1();
}

public class ThiskeyWithAnonymousWL {
	int x=99;
		public void m2() {
			Int1 i=()->{
				int x=80;
				System.out.println(this.x);
			};
			i.m1();
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThiskeyWithAnonymousWL t = new ThiskeyWithAnonymousWL();
		t.m2();
			}
	}

