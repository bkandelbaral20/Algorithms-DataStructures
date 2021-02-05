package javaRefresher.Champion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

    public class Champion {

        public static void main(String[] args) throws IOException {

            // Open the file
            String fileLocation = "/Users/binjitakandelbaral/Documents/CodeUpExercise/Algorithms-DataStructures/src/javaRefresher/Champion/WorldSeriesWinners.txt";

            BufferedReader bufReader = new BufferedReader(new FileReader(fileLocation) );

            String listOfLines[] = new String[104];

            for(int i = 0; i < listOfLines.length; i++){
                listOfLines[i] = bufReader.readLine();
            }

            bufReader.close();

            System.out.println(Arrays.toString(listOfLines));
//            System.out.println(listOfLines.length);

            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter the name of the team : ");
            String userName = sc.nextLine();
            System.out.println(userName);
            int count = 0;

            for ( int i = 0; i < listOfLines.length; i++ ) {
                if (listOfLines[i].equalsIgnoreCase(userName)) {
                    count++;
                }
            }
            System.out.println(count);
            System.out.println( userName + " had won the game " + count);
        }
    }




