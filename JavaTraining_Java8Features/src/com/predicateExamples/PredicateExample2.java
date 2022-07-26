package com.predicateExamples;

import java.util.function.Predicate;

public class PredicateExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<String> p=s->s.length() > 6;
		System.out.println(p.test("TestString"));
		System.out.println(p.test("est"));
	}

}
