package datastructures.arrays;

import java.util.LinkedList;

/*
LinkedList consists of group of nodes in sequence
LinkedList can grow and shrink dynamically
value -> [10|104] <- address to the next node in the list
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.addFirst(5);
        System.out.println(linkedList);
    }
}
