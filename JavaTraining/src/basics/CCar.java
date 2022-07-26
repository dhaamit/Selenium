package basics;

public class CCar {
	String Model;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			CCar a = new CCar();
			CCar b = new CCar();
			CCar c = new CCar();
			
			a.Model = "BMW";
			b.Model = "Skoda";
			c.Model = "Maruti";
			
			System.out.println(a.Model);
			System.out.println(b.Model);
			System.out.println(c.Model);
			System.out.println();
			
			a=b;
			b=c;
			c=a;
			
			System.out.println(a.Model);
			System.out.println(b.Model);
			System.out.println(c.Model);
	}

}
