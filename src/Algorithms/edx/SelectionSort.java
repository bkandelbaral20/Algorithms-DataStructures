package Algorithms.edx;


import java.util.Arrays;

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

//              we need to swap it now
            int temp = nums[miniIndex];
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
