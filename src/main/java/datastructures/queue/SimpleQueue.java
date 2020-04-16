package datastructures.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class SimpleQueue {
	
	public static void main(String[] args) {
		//Since queue is an interface, we need to add proper implementation for it.
		Queue<String> queueA = new LinkedList<String>();

		queueA.add("element 1");
		queueA.add("element 2");
		queueA.add("element 3");	
		
		Object firstElement = queueA.peek();
		System.out.println(firstElement);
		Object firstElementAlso = queueA.element(); //Throws exception if element not found
		System.out.println(firstElementAlso);
		
		//Iteration
		//access via Iterator
		System.out.println();
		System.out.println("Iteration with while:");
		Iterator<String> iterator = queueA.iterator();
		while(iterator.hasNext()){
		  String element = (String) iterator.next();
		  System.out.println(element);
		}

		System.out.println();
		System.out.println("Iteration with for loop:");
		//access via new for-loop
		for(Object object : queueA) {
		    String element = (String) object;
		    System.out.println(element);
		}
		
		System.out.println();
		System.out.println("Removing of elements");
		queueA.remove();
		//access via new for-loop
		for(Object object : queueA) {
		    String element = (String) object;
		    System.out.println(element);
		}
		
		System.out.println();
		System.out.println("Removing specific element");
		queueA.remove("element 3");
		//access via new for-loop
		for(Object object : queueA) {
		    String element = (String) object;
		    System.out.println(element);
		}
		
	}

}
