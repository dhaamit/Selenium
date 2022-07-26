package collectionAPIsExamples;

import java.util.Arrays;
import java.util.List;

public class ArrayClassToListExample {

	public static void main(String[] args) {
		String [] str = {"A","Z","B"};
		
		List<String> li=Arrays.asList(str);
		System.out.println(li);
		
		li.set(1,"K");
		System.out.println(li);
	}
}
