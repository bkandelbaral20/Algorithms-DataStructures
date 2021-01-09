package Algorithms;

/*
Write a program that prints a staircase of size n.

   #
  ##
 ###
####

 */
public class StairCase {
    public static void main(String[] args) {
        stairCase(4);
    }

    static void stairCase(int n) {
//        outer loop
        for (int i = 0; i < n; i++) {
//            for inner loop
            for (int j = 0; j < n; j++) {
                if (i >= j) {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
