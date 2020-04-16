package datastructures.linkedlist;

/**
 * Implements a single linked list data structure.
 * The list contains nodes that are linked between them.
 */
public class CustomLinkedList {
    /**
     * Head of the list.
     */
    Node head;

    /**
     * Last node of the list.
     */
    Node tail;

    /**
     * Constructor to initialize an object of this class.
     */
    public CustomLinkedList() {
        head = null;
        tail = null;
    }

    /**
     * This method implements the functionality of adding a new element to the list.
     * The element will be added in the beginning of the list.
     * @param newNode - the node to be inserted.
     */
    public void insertFirst(Node newNode) {
        //In case the list is empty then the last node becomes the newly added node.
        if(tail == null){
            tail = newNode;
        }
        //New node becomes the head of the list.
        newNode.next = head;
        head = newNode;
    }

    /**
     * Inserts a new node at the end of the list.
     * @param newNode - node to be added
     */
    public void insertLast(Node newNode){
        //Make sure it does not have a next node linked to it
        newNode.next = null;
        //Last node of the list becomes the newly added node.
        tail.next = newNode;
        tail = newNode;
    }

    /**
     * Display in the console all the elements from the list.
     */
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
        } else {
            Node node = head;
            System.out.print("List: ");
            // Iterate through the entire list.
            while(node != null){
                System.out.print(node.data + ", ");
                node = node.next;
            }
        }
    }
}
