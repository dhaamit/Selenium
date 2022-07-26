package com.functionalInterfaceExamples;

import java.util.function.Function;
public class Exmaple1 {

	public static void main(String[] args) {
		//Program to print length of a string
		Function<String,Integer> f= s-> s.length();
		System.out.println(f.apply("RajaRam"));
		System.out.println(f.apply("Ram"));
		
		//program to print sqaure of a number
		Function<Integer, Integer> f1=i->i*i;
		System.out.println("Square of a number"+f1.apply(4));
	
		//program to count number if spaces in a string
		String str="Banagalore is too cold now a days";
		Function<String, Integer> f2=s->(s.length() - s.replaceAll(" ","").length());
		System.out.println("Number of spaces="+f2.apply(str));
	}

}
