package javaRefresher;

public class DimensionalArray {

        public static void main(String[] args) {

            //declare and create 2D array, has 2 column and 5 rows
            int[][] numbers = new int[2][5];

            //initializing 2D Array
            numbers = new int[][]{{1, 0, 12, 2, 4},
                    {7, 8, 3, 5, 4,}};

            System.out.println("The total numbers in array is = " + getTotal(numbers));
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


    }

