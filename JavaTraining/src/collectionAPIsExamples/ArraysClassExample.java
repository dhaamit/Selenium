package collectionAPIsExamples;

import java.util.Arrays;

public class ArraysClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i[] = {10,0,5,6};
		Arrays.sort(i);
		//int br=Arrays.binarySearch(i, 7);
		int br=Arrays.binarySearch(i, 0);
		System.out.println(br);
	}

}
