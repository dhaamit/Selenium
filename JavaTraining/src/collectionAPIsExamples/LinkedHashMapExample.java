package collectionAPIsExamples;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.RandomAccess;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		
		LinkedHashMap<String, String> map=new LinkedHashMap<String, String>();
		map.put("cName","Synechron");
		map.put("location","Bangalore");
		map.put("country","Synechron");
	
		Set<String> s=map.keySet();
		for(String x:s) {
			System.out.println(x);		
		}
		
		Collection<String> v=map.keySet();
		for(String x:s) {
			System.out.println(x);		
		}
		
		Set<Entry<String, String>> e=map.entrySet();
		for(Entry<String, String> x:e) {
			System.out.println(x);
		}	
		System.out.println(map instanceof Serializable);
		System.out.println(map instanceof Cloneable);
		System.out.println(map instanceof RandomAccess);
	
	}
}
