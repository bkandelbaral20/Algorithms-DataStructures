package javaRefresher;

import java.util.Scanner;

public class UsingLoop {
    public static void main(String[] args) {
        final int EMPLOYEES = 3;
        int[] hours = new int[EMPLOYEES];
        Scanner keyboard = new Scanner(System.in);
        System.out.println(" Enter the hours worked by " + EMPLOYEES + " employees ");

        // get the hours for each employees
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("employee " + (i + 1) + " : ");
            hours[i] = keyboard.nextInt();
        }
        System.out.println(" the hours you entered are in employee 1 : " + hours[0]);
        System.out.println(" the hours you entered are in employee 2 ; " + hours[1]);
        System.out.println(" the hours you entered are in employee 3 : " + hours[2]);
    }
}
