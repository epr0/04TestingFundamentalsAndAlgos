package datastructures.queue;

public class Main {

    public static void main(String[] args) {
        CustomQueue queue = new CustomQueue();
        queue.enqueue(10);
        queue.enqueue(5);
        queue.dequeue();
        queue.enqueue(7);
        System.out.println("Front value is: " + queue.front().data);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
    }
}
