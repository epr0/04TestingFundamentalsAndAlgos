package algorithms;

/**
 * Display the fibonacci number using recursion.
 */
public class FibonacciRecursive {

    public static void main(String[] args){
        int value = fibonacci(10);
        System.out.println(value);
    }

    /**
     * Method that computes the fibonacci value.
     * @return - the n(th) value from the fibonacci numbers.
     */
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }
}
