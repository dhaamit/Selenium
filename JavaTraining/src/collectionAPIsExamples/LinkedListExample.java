package collectionAPIsExamples;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList <Integer> l = new LinkedList<Integer>();
		
		for(int i=10;i<=100;i=i+10)
		{
			l.add(i);
		}
		System.out.println(l);
		
		l.addFirst(1);
		System.out.println(l);
		l.addLast(110);
		System.out.println(l);
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		System.out.println(l.removeFirst());
		System.out.println(l.removeLast());
		System.out.println(l);
		System.out.println("----------------------");
		for (int x:l)
		{
			System.out.println(x);
		}
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(11);
		ar.add(22);
		LinkedList<Integer> l2=new LinkedList<Integer>(ar);
		System.out.println(l2);
	}

}
