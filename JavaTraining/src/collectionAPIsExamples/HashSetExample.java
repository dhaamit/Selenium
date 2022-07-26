package collectionAPIsExamples;

import java.io.Serializable;
import java.util.HashSet;

import java.util.Iterator;
import java.util.RandomAccess;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<Object> s=new HashSet<Object>();
		s.add("B");
		s.add("C");
		s.add("P");
		s.add("B");
		s.add("C");
		System.out.println("size="+s.size());
		System.out.println();
		//s.get();XXXX NOT ALLOWED
		Iterator<Object> it = s.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(s instanceof Serializable);
		System.out.println(s instanceof Cloneable);
		System.out.println(s instanceof RandomAccess);
		
		HashSet<Object> s1=new HashSet<Object>(10);
		s1.add("as");
		System.out.println(s1.size());
	}
	

}
