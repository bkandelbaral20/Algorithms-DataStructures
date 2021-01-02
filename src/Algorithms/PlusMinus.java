package Algorithms;

/*
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the
decimal value of each fraction on a new line with 6 places after the decimal.
There are n = 5 elements, two positive, two negative and one zero.
Their ratios are 2/5= 0.400000 ,2/5= 0.400000 and 1/5 = 0.200000.

 */

public class PlusMinus {
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, -1, -1};
        plusM(nums);
//        System.out.println("the value with 6 digits decimal point %6.f %n");

    }

    static void plusM(int[] nums) {
        int zeroSum = 0;
        float zeroSumDouble;
        int negativeSum = 0;
        float negativeSumDouble;
        int positiveSum = 0;
        float positiveSumDouble;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroSum++;
            } else if (nums[i] < 0) {
                negativeSum++;
            } else {
                positiveSum++;
            }
        }
        zeroSumDouble = (float) zeroSum / nums.length;
        negativeSumDouble = (float) negativeSum / nums.length;
        positiveSumDouble = (float) positiveSum / nums.length;


        System.out.format(" %.6f", zeroSumDouble);
        System.out.format("\n %.6f", negativeSumDouble);
        System.out.format("\n %.6f", positiveSumDouble);
    }


}
