package userDefinedFunctions;

public class CallByRef {
	int x =10;
	int y =20;
	
	public void swap(CallByRef r)
	{
		int temp = r.x;
		r.x = r.y;
		r.y = temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByRef cbr = new CallByRef();
		System.out.println("before calling swap x = "+cbr.x+ " and y = "+cbr.y);
		cbr.swap (cbr);
		System.out.println("before calling swap x = "+cbr.x+ " and y = "+cbr.y);
	}

}

