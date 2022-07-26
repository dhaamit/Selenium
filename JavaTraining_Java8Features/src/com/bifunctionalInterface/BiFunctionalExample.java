package com.bifunctionalInterface;

import java.util.function.BiFunction;

public class BiFunctionalExample {

	public static void main(String[] args) {
		// input 2 numbers and get product of it
		BiFunction<Integer, Integer, Integer> f=(a,b)->a*b;
		System.out.println(f.apply(10, 20));

	}

}
