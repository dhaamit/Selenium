package com.functionalInterfaceExamples;

import java.util.ArrayList;
import java.util.function.Function;

class Student{
	String name;
	int marks;
	
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	
	public String toString(){
		return name+":"+marks;
	}
}
public class Example2 {

	public static void main(String[] args) {
		 ArrayList<Student> l=new ArrayList<Student> ();
		 populate(l);
		 System.out.println(l);
		 Function<Student,String> f = s->{
			 int marks =s.marks;
			 if(marks >= 80)
			     return "A[Distinction]";
			 else if(marks >=60)
				 return "B[FirstClass]";
			 else if(marks >=50)
				 return "C[SecondClass]";
			 else if(marks >=35)
				 return "D[Justpass]";
			 else if(marks<35)
				 return "E[Fail]";
			 else
				 return "Invalid marks entered";
				 
		 };
		 for(Student x : l){
			 System.out.println("Student name : "+x.name);
			 System.out.println("Student marks : "+x.marks);
			 System.out.println("Student Grade : "+f.apply(x));
			 System.out.println();
		 }

		}
		public static void populate(ArrayList<Student> l){
			l.add(new Student("Srinivas",78));
			l.add(new Student("Ram",18));
			l.add(new Student("Raj",58));
			l.add(new Student("Beem",48));
			l.add(new Student("Srinivas",61));
		}

}
