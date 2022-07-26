package com.lambdaFunctionMultithread;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t=new TreeSet<Integer>((t1,t2)->t1.compareTo(t2)); 
		t.add(10);
		t.add(0);
		t.add(3);
		t.add(2);
		t.add(15);
		t.add(3);
		
		System.out.println(t);
	}

}
