package algorithms;

/**
 * Implements the binary search algorithm.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int left = 0;
        int right = arr.length - 1;
        //value to search
        int x = 1;
        int mid;
        boolean found = false;

        while (left <= right) {
            // Compute the middle of the searching interval.
            mid = (left + right) / 2;
            if (x == arr[mid]) {
                System.out.println(String.format("Found value %d at position %d.", x, mid));
                found = true;
                break;
            } else {
                if (x < arr[mid]) {
                    // Search in the left interval.
                    right = mid - 1;
                } else {
                    // Search in the right interval.
                    left = mid + 1;
                }
            }
        }
        if (found == false) {
            System.out.println(String.format("The value %d was not found.", x));
        }
    }
}
