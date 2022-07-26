package collectionAPIsExamples;

import java.util.TreeSet;

public class TreeSetExampleDescending {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>(new ReverseComparator());
		t.add(4);
		t.add(3);
		
		t.add(0);
		t.add(2);
		t.add(2);


		System.out.println(t);

		/*
		 * Constructors --------------- 
		 * i. TreeSet<Integer> t=new TreeSet<Integer>();
		 * ii. TreeSet<Integer> t=new TreeSet<Integer> (Comparator c); 
		 * iii.TreeSet<Integer> t=new TreeSet<Integer>(collect c); 
		 * iv. TreeSet<Integer> t=new TreeSet<Integer>(SortedSet s);
		 */

	}

}
