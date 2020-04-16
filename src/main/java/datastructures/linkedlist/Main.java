package datastructures.linkedlist;

public class Main {

    public static void main(String[] args) {
        CustomLinkedList linkedList = new CustomLinkedList();
        linkedList.insertFirst(new Node(5));
        linkedList.insertFirst(new Node(0));
        linkedList.insertFirst(new Node(14));

        linkedList.insertLast(new Node(6));
        linkedList.insertLast(new Node(7));

        linkedList.printList();
    }
}
