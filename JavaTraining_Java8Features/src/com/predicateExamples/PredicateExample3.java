package com.predicateExamples;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateExample3 {

	public static void main(String[] args) {
		// program to check if ArrayList is empty or not
		ArrayList <String> ar = new ArrayList<String>();
		Predicate<ArrayList<String>> p = a->a.isEmpty();
		System.out.println(p.test(ar));
		ar.add("Bangalore");
		System.out.println(p.test(ar));
	}

}
