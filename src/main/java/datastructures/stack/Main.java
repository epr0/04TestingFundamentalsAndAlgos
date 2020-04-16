package datastructures.stack;

public class Main {

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(5);

        System.out.println("Stack empty? - " + stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Stack peek - " + stack.peek());
        stack.pop();
        stack.push(7);
        while (stack.isEmpty() == false) {
            stack.pop();
        }
        System.out.println("Stack empty? - " + stack.isEmpty());

        stack.pop();
    }
}
