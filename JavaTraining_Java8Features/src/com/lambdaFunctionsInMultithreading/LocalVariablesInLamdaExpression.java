package com.lambdaFunctionsInMultithreading;
interface Interx{
	public void m1();
}
public class LocalVariablesInLamdaExpression {
		int x=20; //instance variable
		public void m2(){
			int y=30; //Local variable (implicitly final)
			Interx i=()->{
				x =222;
				//y=333; // we can not over ride because y value considered as final
				System.out.println(x);
				System.out.println(y);
			};
			i.m1();
		}
	public static void main(String[] args) {
		
		LocalVariablesInLamdaExpression t=new LocalVariablesInLamdaExpression();
		t.m2();
	}

}