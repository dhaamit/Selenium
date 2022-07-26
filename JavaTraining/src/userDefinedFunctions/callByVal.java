package userDefinedFunctions;

public class callByVal {
	int x =10;
	int y =20;
	
	public void swap(int a, int b)
	{
		int temp = a;
		a = b;
		b = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callByVal cbv = new callByVal();
		System.out.println("before calling swap x = "+cbv.x+ " and y = "+cbv.y);
		cbv.swap (cbv.x,cbv.y);
		System.out.println("before calling swap x = "+cbv.x+ " and y = "+cbv.y);
	}

}
