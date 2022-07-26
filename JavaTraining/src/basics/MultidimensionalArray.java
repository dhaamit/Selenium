package basics;

public class MultidimensionalArray {

	public static void main(String[] args) {
		Object obj[][] = {{"name1","pwd1"},{"name2","pwd2"},{"name3","pwd3"}};

		/*
		 * for (int i=0;i<obj.length;i++) { for (int j=0;j<obj[0].length;j++) {
		 * System.out.print(obj[i][j] + " "); } System.out.println(); }
		 */
		
		for (Object [] x : obj)
		{
			for (Object y : x)
			{
				System.out.print(y + " ");
			}
			System.out.println();
		}
	}

}
