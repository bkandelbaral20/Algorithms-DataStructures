package javaRefresher;

public class DimensionalArray {

    public static void main(String[] args) {

        //declare and create 2D array, has 2 column and 5 rows
        int[][] numbers = new int[2][5];

        //initializing 2D Array
        numbers = new int[][]{ {1, 0, 12, 2, 4},
                               {7, 8, 3, 5, 4,} };

        System.out.println("The total numbers in array is = " + getTotal(numbers));
        System.out.println("The Average of this array is = " + getAverage(numbers));
        System.out.println("The row total of this array is = " + getRowTotal(numbers, 0)); // it will count the first row because it start at 0
        System.out.println("The column total of this array is = " + getColumnTotal(numbers, 3)); // it will count the second column because it start at 0
    }


    // getTotal method and return total value of the array
    public static double getTotal(int[][] numbers) {
        double totalValue = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                totalValue = totalValue + numbers[i][j];
            }
        }
        return totalValue;
    }

    // getAverage method and return averages of all values
    public static double getAverage(int[][] numbers) {
        int totalNumberOfElements = 10; // (2 rows * 5 column)
        return getTotal(numbers) / totalNumberOfElements;
    }

    // getRowTotal, second arguments should be the subscript of a row and return the total values in the specific row
    public static double getRowTotal(int[][] numbers, int a) {
        double total = 0;
        for (int i = 0; i < numbers[a].length; i++) {
            total += numbers[a][i];
        }
        return total;
    }

    //getColumnTotal,second arguments should be the subscript of a row and return the total values in the specific column
    public static double getColumnTotal(int[][] numbers, int a) {
        double total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i][0];
        }
        return total;
    }

}

