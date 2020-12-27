package Algorithms;

/*
Write a program that outputs the string representation of numbers from 1 to n.
But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
For numbers which are multiples of both three and five output “FizzBuzz”.
*/


import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {

//         creating empty arraylist that takes string
        List<String> newString = new ArrayList<String>();

        for (int num = 1; num <= n; num++) {
            if (num % 3 == 0) {
                newString.add("Fizz");
            }
            if (num % 5 == 0) {
                newString.add("Buzz");
            }
            if (num % 3 == 0 && num % 5 == 0) {
                newString.add("FizzBuzz");
            } else {
                newString.add(Integer.toString(num));
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        System.out.println("The fizzbuzz numbers are:  \n" + fizzBuzz(20));
    }
}

