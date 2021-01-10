package Algorithms.edx.Algo;

/*
We established that if our input array is not sorted, then we can't really improve from doing a linear search,
because our desired element could be anywhere in the array. However, if our array is sorted, then we could improve
significantly by doing a Binary Search.

Here is the pseudocode:

    compare with median:
        if size of array is 1:
            if the numbers match:
                return found
            else:
                return not found
        if greater than median:
            compare with the second half
        else if less than median:
            compare with the first half
        else:
            return found
 */

public class BinarySearch {

    public static void main(String[] args) {

        int[] nums = {1, 3, 4, 5, 7, 9, 13, 15, 16, 17, 19};
        System.out.println(searching(nums, 21));
    }

    //        From this array searching if we have a 15 in it or not
    public static boolean searching(int[] nums, int num) {

//      First start by checking if array length is null or not
        if (nums.length == 0) {
//                System.out.println("Invalid array");
            return false;
        }

//      Now lets starting creating left and right half
        int left = 0; //because it start from o index
        int right = nums.length - 1; // it is upto the last element of an array

//      Now calculating the median(mid-point) from an array

        while (left <= right) {
            int midPoint = left + (right - left) / 2;

//      Checking if target value is equals to the median value
            if (num == nums[midPoint]) {
//                    System.out.println(num + " is in the arrayList");
                return true;
            }

//      Checking if target value is smaller than to the median value then ignore left half else ignore right half array
            if (nums[midPoint] > num) {
                right = midPoint - 1;
            } else {
                left = midPoint + 1;
            }
        }
//            System.out.println(num + " is in the arrayList");
        return false;
    }

}
