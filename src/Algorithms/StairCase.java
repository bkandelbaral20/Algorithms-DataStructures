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
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < n; j++) {
                if (i >= j) {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
