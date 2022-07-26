package basics;

import java.util.Scanner;

public class IfElseLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Marks..");
		Scanner s = new Scanner (System.in);
		int marks = s.nextInt();
		
		if(marks <30)
		{
			System.out.println("Fail");
		}else if (marks <40)
		{
			System.out.println("Passed");
		}else if (marks <=60)
		{
			System.out.println("Second Class");
		}else if (marks <=70)
		{	System.out.println("First Class");
		}else
		{
			System.out.println("Distinction");
		}
		}

}
