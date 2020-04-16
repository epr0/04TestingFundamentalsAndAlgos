package algorithms;

/**
 * Calculates the factorial of a number using recursion.
 */
public class FactorialRecursive {

    public static void main(String[] args) {
        int n = 10;
        int result = factorial(n);
        System.out.println(String.format("%d! = %d", n, result));
    }

    /**
     * Method that computes the factorial value of the parameter received.
     */
    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return n * factorial(n - 1);
    }
}
