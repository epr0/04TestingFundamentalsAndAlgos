package datastructures.arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] simpleArray = { 5, 6, 2, 4, 1, 3, 8 };
		
		System.out.print("This is our array: ");
		
		for (int i = 0; i < simpleArray.length; i++) {
			System.out.print(simpleArray[i] + " ");
		}
		
		int secondBiggestValue = findSecondLargestNumberInTheArray(simpleArray);
		
		System.out.println();
		System.out.println("Second biggest value in the array is : " + secondBiggestValue);
	}

	private static int findSecondLargestNumberInTheArray(int array[]) {
		// Initialize these to the smallest value possible
		int highest = 0;
		int secondHighest = 0;

		// Loop over the array
		for (int i = 0; i < array.length; i++) {
			// If current element is greater than highest
			if (array[i] > highest) {

				// assign second highest element to highest element
				secondHighest = highest;

				// highest element to current element
				highest = array[i];
			} else if (array[i] > secondHighest && array[i] != highest)
				// Just replace the second highest
				secondHighest = array[i];
		}

		// After exiting the loop, secondHighest now represents the second
		// largest value in the array
		return secondHighest;
	}

}
