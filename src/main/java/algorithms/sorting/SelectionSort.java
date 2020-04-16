package algorithms.sorting;

/**
 * This class implements the selection sort algorithm.
 * It sorts the array by repeatedly finding the minimum element from the unsorted part of the array.
 * It is similar to the insertion sort where the array has 2 intervals - the first one is sorted
 * and the second one is unsorted.
 */
public class SelectionSort {

    /**
     * Sort the array using the selection sort algorithm.
     *
     * @param arr - array to be sorted.
     */
    public void sort(int[] arr) {
        int n = arr.length;
        int min_index;
        int aux;

        for (int i = 0; i < n; i++) {
            //Find the index of the minimum element from the unsorted array - which is the right
            // interval of the current element.
            min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[min_index] > arr[j]) {
                    min_index = j;
                }
            }
            //Swap the minimum element with the current element
            aux = arr[i];
            arr[i] = arr[min_index];
            arr[min_index] = aux;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 7, 9, 4, 6, 2, 4, 7, 8, 9, 1};
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        // Display the sorted array.
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
