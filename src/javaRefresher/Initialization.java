package javaRefresher;

    public class Initialization {
        public static void main(String[] args) {
            int [] days = { 31, 32 , 30, 29, 56, 45 };

            for (int index = 0 ; index < days.length; index++){
                System.out.println("Month " + (index + 1 ) + " has " + days[index] + " days. ");
            }

        }
}
