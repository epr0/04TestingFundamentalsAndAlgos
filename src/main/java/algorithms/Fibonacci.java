package algorithms;

/**
 * Class that has the functionality to display the fibonacci numbers in an iterative approach.
 */
public class Fibonacci {

    public static void main(String[] args) {
        int n = 10;
        int a = 0;
        int b = 1;
        int aux;
        int count = 0;

        while (count <= n) {
            System.out.println(a);
            count++;
            aux = b;
            b = a + b;
            a = aux;
        }
    }
}
