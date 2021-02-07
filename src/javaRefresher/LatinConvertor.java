package javaRefresher;

import java.util.Scanner;

public class LatinConvertor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a word or sentence that will convert into Latin : ");
        final String userInput= scanner.nextLine();
        System.out.println("The latin word of " + userInput + " := " + convertToLatin(userInput));
        scanner.close();
    }

    public static String convertToLatin(String string){
        StringBuilder end = new StringBuilder();
        String delimiter = "\\s+";
        String[] words = string.split(delimiter);

        for (int i = 0; i < words.length; i++){
            if (isVowel(words[i].toLowerCase().charAt(0))){
                end.append(words[i]).append("ay ");
            }else {
                end.append(words[i].substring(1)).append(words[i].charAt(0)).append("ay ");
            }
        }
        return end.toString();
    }

    public static boolean isVowel(char c){
        return c == 'a';
    }
}
