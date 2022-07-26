package com.predicateExamples;

import java.util.function.Predicate;

public class IsEqualsMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate <String> p = Predicate.isEqual("RajaRam");
		System.out.println(p.test("RajaRam"));
		System.out.println(p.test("RamRam"));
	}

}
