package collectionAPIsExamples;

import java.io.Serializable;
import java.util.RandomAccess;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapExample {
public static void main(String[] args) {
		
		TreeMap<Object, String> map=new TreeMap<Object, String>();
		map.put(1,"Synechron");
		map.put(4,"Bangalore");
		map.put(2,"Synechron");
	
	/*	Set<String> s=map.keySet();
		for(String x:s) {
			System.out.println(x);		
		}
		
		Collection<String> v=map.keySet();
		for(String x:s) {
			System.out.println(x);		
		}
		*/
		Set<Entry<Object, String>> e=map.entrySet();
		for(Entry<Object, String> x:e) {
			System.out.println(x);
		}	
		System.out.println(map instanceof Serializable);
		System.out.println(map instanceof Cloneable);
		System.out.println(map instanceof RandomAccess);
	
	}
}
