package collectionAPIsExamples;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Object> lh = new LinkedHashSet<Object>();
		lh.add("B");
		lh.add("C");
		lh.add("p");
		lh.add("B");
		lh.add("C");
		
		System.out.println(lh);
		//lt.itertor();
		//for each loop
		
		//constructors
		//1. LinkedHashSet<Object> lh=new LinkedHashSet<Object>();
		//2. LinkedHashSet<Object> lh=new LinkedHashSet<Object>(int intialcapacity);
		//3. LinkedHashSet<Object> lh=new LinkedHashSet<Object>(int intialcapacity,fload loadfactor);
		//4. LinkedHashSet<Object> lh=new LinkedHashSet<Object>(Collection c);
				
	}

}
