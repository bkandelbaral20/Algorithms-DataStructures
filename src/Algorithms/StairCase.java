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
        System.out.println("\n***************");
        stairCase1(4);
    }

    static void stairCase1 (int n) {
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

    static void stairCase(int n){

        StringBuilder build = new StringBuilder();
        for(int i = 0; i < n ; i++){
//            Appending spaces for each iteration
            build.append(" ");
        }
//        System.out.println(build);

//        creating k for targeting the (n.length-1)
        int k = 0;

//       looping through the each element to printout the each row of staircase
        for(int j = 1; j <= n; j++){
//            replacing the spaces with the #
         build.replace(build.length()-j, build.length()-k, "#");
//          System.out.println((build.length()-j) + " " + (build.length()-k));
//            System.out.println(build.length()-k);
            k++;
        }
    }
}
