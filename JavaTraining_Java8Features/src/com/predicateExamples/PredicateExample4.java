package com.predicateExamples;

import java.util.function.Predicate;

public class PredicateExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[]= {"Komal","srinivas","kamal","RamRaj","BheemRaj", "Kaviraj"};
		
		Predicate<String> p=s -> (s.charAt(0)=='K') || (s.charAt(0)=='k');
		
		for(String x: str)
		{
			if(p.test(x)) {
				System.out.println(x);
			}
		}
	}
}
