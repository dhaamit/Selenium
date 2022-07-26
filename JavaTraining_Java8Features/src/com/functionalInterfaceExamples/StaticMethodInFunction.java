package com.functionalInterfaceExamples;

import java.util.function.Function;

public class StaticMethodInFunction {

	public static void main(String[] args) {
		Function <String, String> f=Function.identity();
		System.out.println(f.apply("Hello java..."));
	}

}
