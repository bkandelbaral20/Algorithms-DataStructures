package Algorithms.edx.Algo;

/*
We start at the front of the array and compare each pair of numbers. If they are out of order(ascending order),
we swap them. Then, we move to the next pair and repeat the same process.
sorted from left to right(Bubbling up)
 */

import java.util.Arrays;

public class BubbleSearch {

    static int[] bubbleSort(int [] nums){

//        outer loop
        for (int i = nums.length-1; i> 0; i--) {
//            inner loop
            for (int j = 0; j < i; j++) {
//                if first number is greater than next number then
                if (nums[j] > nums[j + 1]) {
//                     it goes into the temporary variable
                    int temp = nums[j];
//                    assign the first number value of second number;
                    nums[j] = nums[j + 1];
//                    second number gets into temporary variable
                    nums[j + 1] = temp;
                }
            }
        }
        return nums;
        }

    public static void main(String[] args) {

        int numbers [] = {2,5,6,1,8,3,11};

        System.out.println("Original sequence is : " + Arrays.toString(numbers));
        System.out.println("Sorted sequence is : " + Arrays.toString(bubbleSort(numbers)));
    }
}
