package com.predicateExamples;

import java.util.function.Predicate;

public class PredicateExample1 {

	public static void main(String[] args) {
		//program to check a number is greater than 10 or not
		Predicate<Integer> p=i->i>10;
		
		System.out.println(p.test(2));
		System.out.println(p.test(20));
	}

}
