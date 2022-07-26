package collectionAPIsExamples;

import java.util.Stack;
public class StackExample {

	public static void main(String[] args) {
		
		Stack<Object> s=new Stack<Object>();
		s.push(4);
		s.push(3);
		s.push(2);
		//s.iterator();
		//for each loop
		//s.listiterator();
		System.out.println(s);
		System.out.println(s.peek()); //display the top value in stack (Lastvalue in this case since LIFO)
		System.out.println(s.pop()); // remove top value display
		System.out.println(s);
		System.out.println(s.search(3)); // return the index of value
	}

}
