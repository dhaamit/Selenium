package basics;

public class stringFunctions {

	public static void main(String[] args) {
		String str = "Banglore is 978 kilometeres from Pune";
		//String str = "";
		//String str = "    Banglore is 978 kilometeres from Pune             ";
		System.out.println(str.length());
		System.out.println(str.equals("Banglore is 978 kilometeres from Pune"));
		System.out.println(str.equalsIgnoreCase("banglore is 978 kilometeres from Pune"));
		System.out.println(str.isEmpty());
		System.out.println(str.contains("4"));
		System.out.println(str.replace("Bangalore", "Hyderabad"));
		System.out.println("-------------------------------------------------");
		System.out.println(str);
		System.out.println(str.trim());
		System.out.println("-------------------------------------------------");
		System.out.println(str.replace(" ", ""));
		System.out.println("-------------------------------------------------");
		System.out.println(str.substring(10));
		System.out.println(str.substring(2,9));
		System.out.println("-------------------------------------------------");
		System.out.println(str.indexOf("a"));
		System.out.println(str.charAt(2));
		System.out.println("-------------------------------------------------");
		String split []= str.split(" ");
		for (String x : split)
		{
				System.out.println(x);
		}
		System.out.println("-------------------------------------------------");
		String joined = String.join("/", split);
		System.out.println(joined);
		System.out.println("-------------------------------------------------");
		System.out.println("BS".compareTo("AB"));
		System.out.println("Z".compareTo("M"));
		System.out.println("D".compareTo("D"));
	}

}
