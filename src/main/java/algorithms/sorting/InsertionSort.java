package algorithms.sorting;

/**
 * This class implements the insertion sort algorithm.
 * It works by iteration through the entire array of elements one by one. At each step the element is
 * inserted in the sorted array in the right position to keep the list sorted.
 * The sorted array is considered to be the left interval of the current element of the iteration.
 */
public class InsertionSort {

    /**
     * Sort the array using the insertion sort algorithm.
     * @param arr - array to be sorted.
     */
    public void sort(int[] arr) {
        int n = arr.length;

        //Start from index 1. The left side interval - containing only the index 0 at first step -
        // is considered the sorted array.
        for (int i = 1; i < n; i++) {
            int element = arr[i];
            int j = i-1;

            /**
             * Move all the elements from the sorted interval - that are greater than the element
             * we want to insert - one position to the right.
             */
            while (j >= 0 && arr[j] > element) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j+1] = element;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 9, 4, 6, 2, 4, 7, 8, 9, 1};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        // Display the sorted array.
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
