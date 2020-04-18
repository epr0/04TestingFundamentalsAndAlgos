package datastructures.bigo;

/**
 * BigO notation shows the runtime complexity of the algorithm.
 */
public class BigO {

    //RUNTIME COMPLEXITY

    //Size of the input does not matter
    public void log(int[] arrayOfNumbers) {
        // O(1)
        System.out.println(arrayOfNumbers[0]);
    }

    //Size of th input does matter!
    public void log2(int[] arrayOfNumbers) {
        for(int i = 0; i < arrayOfNumbers.length; i++){
            // O(n) , n - size of an input. If n grows, the cost of the algorithm grows linearly
            System.out.println(arrayOfNumbers[i]);
        }
    }

    public void log3(int[] arrayOfNumbers, String[] arrayOfStrings) {
        //O(n + n), or O(2n) it still O(n), because it still represents linear growth!
        for(int i = 0; i < arrayOfNumbers.length; i++){
            System.out.println(arrayOfNumbers[i]);
        }
        for(int i = 0; i < arrayOfNumbers.length; i++){
            System.out.println(arrayOfNumbers[i]);
        }
        //end of O(n)

        // O(m), which in total gives us O(n + m) -> which is O(n), still increases linearly
        for(int i = 0; i < arrayOfStrings.length; i++){
            System.out.println(arrayOfNumbers[i]);
        }
    }

    public void log4(int[] arrayOfNumbers) {
        // O(n * n) -> O(n^2) gives us quadratic growth over time and it is slower over time.
        // Fun fact: you will not see any performance differences with small amount of items.
        for(int first : arrayOfNumbers){
            for(int second : arrayOfNumbers) {
                System.out.println(first + " " + second);
            }
        }
    }

    //SPACE COMPLEXITY

    public void greet(String[] names) {
        //O(n) space , more items we have in array, more space it is going to take
        String[] copy = new String[names.length];
        // O(1) space
        for(int i = 0; i < names.length; i++) {
            System.out.println("Hi " + names[i]);
        }
    }
}
