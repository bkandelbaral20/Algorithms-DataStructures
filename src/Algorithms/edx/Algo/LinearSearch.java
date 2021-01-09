package Algorithms.edx.Algo;

public class LinearSearch {
    public static int search(int[] nums, int num){

        for (int i =0; i< nums.length;i++){
            if(nums[i] == num) {
                System.out.println(" On  index " + i + ", number  " +  num + " is found");
            } else {
                System.out.println(" On  index " + i + ", number  " +  num + " is not found");
            }
        }
        return num;
    }

    public static void main(String[] args) {

        int [] numbers = {1,5,9,6,3,8,2,100};

        System.out.println((search(numbers,3)));
        System.out.println(".........................");
        System.out.println(search(numbers,101));
    }
}
