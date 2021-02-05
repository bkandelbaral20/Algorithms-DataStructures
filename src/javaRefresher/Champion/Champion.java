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

        }
    }




