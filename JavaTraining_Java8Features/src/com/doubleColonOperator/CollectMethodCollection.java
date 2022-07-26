package com.doubleColonOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CollectMethodCollection {

	public static void main(String[] args) {
		ArrayList<String> ar1 = new ArrayList<String>();
		
		ar1.add("MohanRaj");
		ar1.add("Krish");
		ar1.add("Raj");
		ar1.add("Ram");
		ar1.add("Mohanlal");
		ar1.add("Krishna");

		System.out.println(ar1);
		List<String> ar2 = ar1.stream().filter(s->s.length()>=5).collect(Collectors.toList());
		System.out.println(ar1.get(2));
	}
}
