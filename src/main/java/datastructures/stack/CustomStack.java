package datastructures.stack;

/**
 * Implements the stack data structure using an array.
 */
public class CustomStack {
    /**
     * The array where the values are stored.
     */
    private int arr[];

    /**
     * The top of the stack - representing the index of the top element from the stack.
     */
    private int top;

    /**
     * The size of the stack.
     */
    private int size;

    /**
     * Constructor to initialize the stack.
     *
     * @param s - the size of the stack
     */
    public CustomStack(int s) {
        arr = new int[s];
        size = s;
        //initialize with -1 because there are no elements in the stack
        top = -1;
    }

    /**
     * Method that adds a new element to the stack.
     *
     * @param value - the value to be added
     * @return - true if the value was inserted successfully and false otherwise
     */
    public boolean push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow.");
            return false;
        } else {
            System.out.println("Inserting value " + value);
            top++;
            arr[top] = value;
            return true;
        }
    }

    /**
     * Method that returns end removes the top element from the stack. Program will close if the stack is empty.
     *
     * @return - the top element from the stack
     */
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow.");
            return 0;
        }
        int valueToReturn = arr[top];
        System.out.println("Removing value " + valueToReturn);
        top--;
        return valueToReturn;
    }

    /**
     * @return - the top element from the stack without removing it.
     */
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack Underflow.");
            return 0;
        } else {
            return arr[top];
        }
    }


    /**
     * Method that checks if the stack is empty.
     *
     * @return - true if the stack is empty and false otherwise.
     */
    public boolean isEmpty() {
        if (top < 0) {
            return true;
        }
        return false;
    }

    /**
     * Method that check if the stack is full.
     *
     * @return - true if the stack is full and false otherwise
     */
    public boolean isFull() {
        if (top == size - 1) {
            return true;
        }
        return false;
    }
}
