package datastructures.stack;

import java.util.Stack;
import java.util.stream.Stream;

public class SimpleStack {
	
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		stack.push("Genadijus");
		stack.push("Petras");
		
		Stream<String> stream = stack.stream();
		System.out.println("Stack elements before pop");
		stream.forEach((element) -> {
		    System.out.println(element);  // print element
		});
		
		stack.pop();
		System.out.println();
		System.out.println("Stack elements after pop");
	
		
		for(String element : stack) {
			System.out.println(element);
		}
		
		stack.peek();
		System.out.println();
		System.out.println("Stack elements after peek");
	
		for(String element : stack) {
			System.out.println(element);
		}
		
	}

}
