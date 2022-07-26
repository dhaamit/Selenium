package com.lambdaFunctionMultithread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Mycomparator implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		if (o1>o2)
			return -1;
		else if(o1<02)
			return +1;
		else
			return 0;
	}
}

public class ArrayListWoL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ar=new ArrayList<Integer>();

		ar.add(10);
		ar.add(5);
		ar.add(0);
		ar.add(20);
		
		System.out.println(ar);
		Collections.sort(ar, new Mycomparator());
		System.out.println(ar);
	}

}
