package com.functionalInterfaceExamples;

import java.util.function.Function;

public class FunctionChainingExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> f1=i->i*i;
		Function<Integer, Integer> f2=i->i+i;
		
		System.out.println("Square of a number"+f1.apply(2));//4
		System.out.println("Adding same number"+f2.apply(3));//6
		
		System.out.println("Square and add "+f1.andThen(f2).apply(2));//8
		System.out.println("Add and Square "+f1.compose(f2).apply(2));//16
	}

}
