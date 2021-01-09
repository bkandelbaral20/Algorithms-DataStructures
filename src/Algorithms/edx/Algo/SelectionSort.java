package Algorithms.edx.Algo;

import java.util.Arrays;


/*
        Description of SelectionSort :
 We have a random cards on the table.Now we are sorting them in ascending orders which means it is going to go from
 the smallest card to the highest card from left to right
 1.check the smallest card,swipe smallest card with the first card in row.
 2.took at the rest of the card,and pick the smallest cards except the first card because we already sorted it.
 3.repeating the same process from first card to second card.

 We call it Selection Sort, because at each step we select the smallest element from the unsorted portion of the array and swap to the front.
 */

public class SelectionSort {

    public static int[] sort(int[] nums) {

//        using for loop to iterate through each element(outer loop)
        for (int i = 0; i < nums.length; i++) {

//          lets considered minimum value to be first element of an array
            int miniIndex = i;

//        using for loop to iterate through each element until it's sorted(inner loop)
            for (int j = i; j < nums.length; j++) {
                if (nums[j] < nums[miniIndex]) {
                    miniIndex = j;
                }
            }
//       we need to swap it now
            int temp = nums[miniIndex]; //temp is the placeholder to hold the value temporary
            nums[miniIndex] = nums[i];
            nums[i] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] numbers = {10, 2, 6, 4, 8, 1, 9, 11};
        System.out.println("Array of random numbers : " + Arrays.toString(numbers));
        System.out.println("Array of sorted numbers : " + Arrays.toString(sort(numbers)));
    }


}
