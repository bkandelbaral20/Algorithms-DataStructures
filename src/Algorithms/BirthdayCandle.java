package Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of
their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.
Example
candles = [4,4,1,3,2]
The maximum height candles are 4  units high. There are 2 of them, so return 2 .

Function Description

Complete the function birthdayCakeCandles in the editor below.
birthdayCakeCandles has the following parameter(s):
int candles[n]: the candle heights
Returns
int: the number of candles that are tallest

 */
public class BirthdayCandle {
    public static void main(String[] args) {
        ArrayList<Integer> candleList = new ArrayList();
        candleList.add(4);
        candleList.add(1);
        candleList.add(3);
        candleList.add(2);
        candleList.add(4);
        candleList.add(4);
        System.out.println("The total numbers in an arrayList " + candleList);
        System.out.println("The tallest candle is " + Collections.max(candleList));
        System.out.println("Counting the total number of tallest candles " + countingCandles(candleList));
    }
    public static int countingCandles(List<Integer> candles) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) > max) {
                max = candles.get(i);
                count = 1;
            } else if (candles.get(i) == max) {
                count++;
            }
        }
        return count;
    }
}
