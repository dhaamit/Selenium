package com.functionalInterfaceExamples;

import java.util.function.Function;

public class FunctionChainingExample {

	public static void main(String[] args) {
		Function<String, String> f1=s->s.toUpperCase();
		Function<String, String> f2=s->s.substring(0,5);
		
		System.out.println(f1.apply("RajaRamMohanRoy"));
		System.out.println(f2.apply("RajaRamMohanRoy"));
		System.out.println(f1.andThen(f2).apply("RajaRamMohanRoy"));
		System.out.println(f1.compose(f2).apply("RajaRamMohanRoy"));

	}

}
