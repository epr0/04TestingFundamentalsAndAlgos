package algorithms;

/**
 * Calculate the factorial of a number.
 */
public class Factorial {

    public static void main(String[] args) {
        int n = 10;
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result = result * i;
        }
        System.out.println(String.format("%d! = %d", n, result));
    }
}
