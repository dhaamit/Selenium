package collectionAPIsExamples;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		List <String> ar = new ArrayList<String>();
		ar.add("A");
		ar.add("F");
		ar.add("B");
		ar.add("T");
		ar.add("F");
		
		System.out.println(ar.size());
		
		/*
		 * for(int i=0;i<ar.size();i++) { System.out.println(ar.get(i)); }
		 */
		
		/*
		 * for (String x : ar) { System.out.println(x); }
		 */
	
		/*Iterator <String> it = ar.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		
		ListIterator<String> lt = ar.listIterator();
		
		System.out.println(lt.next());
		System.out.println(lt.next());
		System.out.println(lt.previous());
		System.out.println(lt.previous());
			
	}
	

}
