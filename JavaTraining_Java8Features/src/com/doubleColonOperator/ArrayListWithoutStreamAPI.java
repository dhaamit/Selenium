package com.doubleColonOperator;

import java.util.ArrayList;

public class ArrayListWithoutStreamAPI {

	public static void main(String[] args) {
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		for (int i=1;i<=20;i++)
		{
			ar1.add(i);
			if (i%2==0)
			{
				ar2.add(i);
			}	
		}
		System.out.println(ar1);
		System.out.println(ar2);
	}
}
