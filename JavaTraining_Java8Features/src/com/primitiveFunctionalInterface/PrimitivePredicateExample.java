package com.primitiveFunctionalInterface;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PrimitivePredicateExample {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		// print only even numbers in an array
		int x[]= {0,5,10,15,20,25};
		IntPredicate p=i->i%2==0;
		
		for(int x1 : x) {
			if(p.test(x1)) {
				System.out.println(x1);
			}
		}
		long stop =System.currentTimeMillis();
		System.out.println("Total time ="+(stop-start));

	}

}
//Similiarly we have LongPredicate, DoublePredicate
//only 3 primitive interfaces