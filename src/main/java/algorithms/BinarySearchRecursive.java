package algorithms;

/**
 * Implement the binary search algorithm using recursion.
 */
public class BinarySearchRecursive {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int left = 0;
        int right = arr.length - 1;
        //value to search
        int x = 8;

        int index = binarySearch(arr, left, right, x);
        if (index == -1) {
            System.out.println(String.format("The value %d was not found.", x));
        } else{
            System.out.println(String.format("Found value %d at position %d.", x, index));
        }
    }

    /**
     * @param arr   - the array in which the value is searhed
     * @param left  - left index of the interval used for searching
     * @param right - right index of the interval used for searching
     * @param x     - the searched value
     * @return - the index where the value was found or -1 in case the value is not found in the array
     */
    public static int binarySearch(int[] arr, int left, int right, int x) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (x == arr[mid]) {
                return mid;
            } else {
                if (x < arr[mid]) {
                    // Search in the left interval.
                    return binarySearch(arr, left, mid - 1, x);
                } else {
                    // Search in the right interval.
                    return binarySearch(arr, mid + 1, right, x);
                }
            }
        }
        // Default value returned when the element was not found in the array.
        return -1;
    }
}
