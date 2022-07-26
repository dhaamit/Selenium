package collectionAPIsExamples;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class OneMoreArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Object> ar1 = new ArrayList<Object>();
		
		for (int i=10;i<=100;i=i+10)
		{
			ar1.add(i);
		}
		
		System.out.println(ar1);
		ar1.add(2,22);
		System.out.println(ar1);
		ar1.remove(2);
		System.out.println(ar1);
		
		ArrayList<Object> ar2 = new ArrayList<Object>();
		
		ar2.add(11);
		ar2.add(22);
		ar2.add(33);
		
		ar1.addAll(ar2);
		System.out.println(ar1);
		ar1.add(2,ar2);
		System.out.println(ar1);
		
		ar1.add(1,222);
		System.out.println(ar1);
		System.out.println("-----------------------");
		ArrayList<Object> ar3 = new ArrayList<Object>(5);
		ar3.add("B");
		ar3.add("C");
		ar3.add("D");
		
		ArrayList<Object> ar4=new ArrayList<Object>(ar3);
		ar4.add("P");
		System.out.println(ar4);
		
		System.out.println(ar4 instanceof Serializable);
		System.out.println(ar4 instanceof Cloneable);
		System.out.println(ar4 instanceof RandomAccess);
		

	}

}
