package com.doubleColonOperator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayList1Wos {

	public static void main(String[] args) {
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		
		for(int i=1;i<=20;i++)
		{
			ar1.add(i);
		}
		System.out.println(ar1);
		
		List<Integer> ar2 = ar1.stream().map(i -> i*2).collect(Collectors.toList());
		System.out.println(ar2);
	}
}
