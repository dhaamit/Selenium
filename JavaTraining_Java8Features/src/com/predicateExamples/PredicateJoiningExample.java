package com.predicateExamples;

import java.util.function.Predicate;

public class PredicateJoiningExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {0,2,5,10,15,20,25,30};
		
		Predicate<Integer> p1=i->i>10;
		Predicate<Integer> p2=i->i%2==0;
		System.out.println("The number is greater than 10");
		m1(p1,x);
		System.out.println("The numbers which are even:");
		m1(p2,x);
		System.out.println("The numbers which are not greater than 10");
		m1(p1.negate(),x);
		System.out.println("The numbers which are greater than 10 and even");
		m1(p1.and(p2),x);
		System.out.println("The number which are greater than 10 or even");
		m1(p1.or(p2),x);
		
	}

	public static void m1(Predicate<Integer>p, int x[]) {
		for (int x1 : x)
		{ 
			if(p.test(x1)) {
			System.out.println(x1);
			}
		}
	}
}
