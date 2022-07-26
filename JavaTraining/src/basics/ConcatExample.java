package basics;

public class ConcatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=20;
		String str1 = "Hello";
		String str2 = "Java";
		
		System.out.println(x+y+str1+str2);
		System.out.println(str1+str2+x+y);
		System.out.println(str1+str2+(x+y));
	}

}
