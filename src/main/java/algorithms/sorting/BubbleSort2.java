package algorithms.sorting;

import java.util.Arrays;

public class BubbleSort2 {
    public static void main(String[] args) {
        int[] givenList = {8,5,6,1,3,4};
        System.out.println("Given array: " + Arrays.toString(givenList));
        System.out.println("Sorted array: " + Arrays.toString(bubbleSort(givenList)));
    }

    private static int[] bubbleSort(int[] list) {

        int i, j, temp = 0;
        for(i = 0; i < list.length - 1; i++) {
            //inner loop will run till reach list length - 1 and - number of items which are already sorted
            for(j = 0; j < list.length - 1; j++){
                //now compare given item to the item on the right
                if(list[j] > list[j+1]){
                    temp = list[j]; //make first itemp temp
                    list[j] = list[j+1]; //swap first with second
                    list[j+1] = temp; //assign the first value stored in temp to the second value so instead 1 and 2 we get 2 and 1
                }
            }
        }

        return list;
    }
}
