package javaRefresher;

import java.util.Scanner;

// Calculate the hours of pay rate and gross pay of 5 employees who all make the same hourly rate

public class PayArray {

    public static void main(String[] args) {
        final int EMPLOYEES = 5;
        double payRate;
        double grossPay;

        int[] hours = new int[EMPLOYEES];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the hours for each " + EMPLOYEES + " employees ");

        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println(" Employees " + (i + 1) + " : ");
            hours[i] = scan.nextInt();
        }

        // calculate the pay-rate for each employees
        System.out.println(" Enter the pay-rate for employees ");
        payRate = scan.nextInt();

        // calculate the gross-pay for each employees
        System.out.println(" The gross pay rate of each employees are :");
        for (int i = 0; i < EMPLOYEES; i++) {
            grossPay = hours[i] * payRate;
            System.out.println(" Employee " + (i + 1) + " : " + grossPay);
        }
    }
}

