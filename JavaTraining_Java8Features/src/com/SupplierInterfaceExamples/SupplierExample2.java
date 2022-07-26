package com.SupplierInterfaceExamples;

import java.util.function.Supplier;

public class SupplierExample2 {

	public static void main(String[] args) {
		// pick name randomly from names Array
		
		Supplier<String> s=()->{
			String str[]= {"Rama","Krishna","Manohara","Madhokshara","amit"};
			int x=(int)(Math.random()*5);
			System.out.println(x);
			return str[x];
		};
		System.out.println(s.get());

	}

}
