package Algorithms;
/* Complete the function solveMeFirst to compute the sum of two integers.
        Example
        a = 5
        b = 3
        Return 8

 Function Description
         solveMeFirst has the following parameters:
        int a: the first value
        int b: the second value
        Returns
 */

import java.util.Scanner;

public class SolveMeFirst {
    static int solveMeFirst(int a, int b) {
        return a+b;

    }

    public static void main(String[] args) {

//        using scanner object for userInput on command line
        Scanner in = new Scanner(System.in);
        System.out.println("Please type 2 number here : ");
        int a;
        a = in.nextInt();

        int b;
        b = in.nextInt();

        int sum;
        sum = solveMeFirst(a, b);

        System.out.println("The sum of " + a  + " and " + b + " is " + sum);
    }
}
