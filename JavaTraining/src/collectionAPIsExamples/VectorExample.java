package collectionAPIsExamples;

import java.util.ArrayList;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector <Object>v = new Vector<Object>(10,2);
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("A");
		v.add("B");
		v.add("C");
		v.add("D");
		v.add("A");
		v.add("B");
		v.add("C");
		
		//with normal forloop
		//for each loop
		//iterator
		//v.listiterator()
		
		System.out.println(v.size());
		System.out.println(v.get(2));
		//initial capacity=10
		//new capacity=current capacity*2
		System.out.println(v.capacity());
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		//Synchronous (Thread Safety)
		ArrayList<Object> ar=new ArrayList<Object>();
		ar.add("A");
		ar.add("B");
		Vector<Object> v1=new Vector<Object>(ar);
		System.out.println(v1);
		
	}
}
