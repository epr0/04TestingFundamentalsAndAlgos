package datastructures.queue;

/**
 * Class that implements the queue data structure using a single linked list.
 */
public class CustomQueue {

    /**
     * Variable that stores the front node of the queue.
     */
    private Node front;

    /**
     * Variable that stores the last node of the queue.
     */
    private Node rear;

    /**
     * Constructor to initialize the queue.
     */
    public CustomQueue() {
        front = null;
        rear = null;
    }

    /**
     * Method to add a new element to the queue.
     *
     * @param value - value to be added
     */
    public void enqueue(int value) {
        Node newNode = new Node(value);
        System.out.println("Inserting node with value " + value);
        // If the queue is empty then the newNode becomes foth the front and the rear of the queue
        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            // Add the newNode at the end of the queue
            rear.next = newNode;
            //newNode becomes the last node from the queue
            rear = newNode;
        }
    }

    /**
     * @return - and remove the first node from the queue.
     */
    public Node dequeue() {
        if (front == null) {
            //In this case the queue is empty.
            System.out.println("Queue is empty.");
            return null;
        } else {
            Node nodeToReturn = front;
            //front becomes the next node from the queue
            front = front.next;

            // If front becomes null then the queue is empty and rear has to be null.
            if (front == null) {
                rear = null;
            }
            System.out.println("Removing node with value " + nodeToReturn.data);
            return nodeToReturn;
        }
    }

    /**
     * @return - the front node without removing it.
     */
    public Node front() {
        return front;
    }
}
