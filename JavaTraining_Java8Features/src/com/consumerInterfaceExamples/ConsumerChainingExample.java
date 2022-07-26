package com.consumerInterfaceExamples;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/*class Student{
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
*/
public class ConsumerChainingExample {

	public static void main(String[] args) {
		// Program to Display student information uy using Predicate,Function and Consumer
		// To display only student details who scored marks >=60
		 ArrayList<Student> l=new ArrayList<Student> ();
		 populate(l);
		 System.out.println(l);
		 Predicate<Student> p=s ->s.marks>=60;
		 Function<Student,String> f = s ->{
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
		 Consumer<Student> c1=s->{
			 System.out.println("Student name: "+s.name);
			 System.out.println("marks : "+s.marks);
			 System.out.println("Grade :"+f.apply(s));
			 System.out.println();
		 };
		 Consumer<Student> c2=s->System.out.println("Eligible for IAS Exams..");
		 for(Student x : l){
			 if(p.test(x)){
				 c1.andThen(c2).accept(x);
			 }
		 }
	}
	public static void populate(ArrayList<Student> l){
		l.add(new Student("Srinivas",78));
		l.add(new Student("Ram",18));
		l.add(new Student("Raj",58));
		l.add(new Student("Beem",48));
		l.add(new Student("SrinivasNarayan",61));
	}

}