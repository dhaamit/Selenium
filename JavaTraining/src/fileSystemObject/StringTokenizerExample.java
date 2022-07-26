package fileSystemObject;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "Bangalore is too cold today"; // Splits with Space by default
		String str = "Bangalore is too cold today"; // Splits with Space by default

//		StringTokenizer st = new StringTokenizer(str); //split with space by default
//		StringTokenizer st = new StringTokenizer(str,"a"); //split with 'a'
		StringTokenizer st = new StringTokenizer(str,"a",true); //also add a after splitting
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	
	}

}
