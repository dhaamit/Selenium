package collectionAPIsExamples;

import java.util.Comparator;
public class ReverseComparator implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		Integer l1 = (Integer)o1;
		Integer l2 = (Integer)o2;
		
		return -l1.compareTo(l2);
		
	/*	if(l1<l2)
		{
			return +1;
		}
		else if(l2>l1)
		{
			return -1;
		}
		else
		{
			return 0;
		}*/
	
	}

}
