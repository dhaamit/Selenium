package basics;

public class TypeCasting {

	public static void main(String[] args) {
		/*
		 * int b=150; byte a = (byte) b; System.out.println(a);
		 * 
		 * int c=65; char d = (char) c; System.out.println(d);
		 */
	
		float f = 23.55f;
		int e =(int) f;
		System.out.println(e);
		
		for (int m=49;m<=300;m++)
		{
			char n = (char) m;
			System.out.print(n + " ");
			if (m==100) {System.out.println();}
		}
				
 	}

}
