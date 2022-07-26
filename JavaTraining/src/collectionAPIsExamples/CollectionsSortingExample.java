package collectionAPIsExamples;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSortingExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar =new ArrayList<Integer>();
		ar.add(10);
		ar.add(0);
		ar.add(5);
		ar.add(20);
		ar.add(23);
		ar.add(110);
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);
		
		Collections.sort(ar, new ReverseComparator());
		System.out.println(ar);
		
		Collections.reverse(ar);
		System.out.println(ar);
		
		//Binary search-- successful search index, unsuccessful -ve value for insertion point
		System.out.println("------- BINARY SEARCH -----------");
		System.out.println(ar);
		Collections.sort(ar);
		int br=Collections.binarySearch(ar,20);
		System.out.println(br);
		Collections.reverse(ar);
		System.out.println(ar);
		br=Collections.binarySearch(ar,20);
		System.out.println(br);
		
	}

}
