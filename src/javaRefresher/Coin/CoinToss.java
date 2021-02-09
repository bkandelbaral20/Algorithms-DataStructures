package javaRefresher.Coin;

public class CoinToss {

    // creating the instance of a coin class

    public static void main(String[] args) {
        Coin penny = new Coin();
        int numberOfTosses = 20;
        int totalNumberOfHeads = 0;
        int totalNumberOfTails = 0;

        System.out.println(" While tossing a coin, side facing up is " + penny.getSideUp());

        // using loop to toss the coin 20 times
        for (int currentToss = 1; currentToss <= numberOfTosses; currentToss++) {
            penny.toss();

            if (penny.getSideUp().equals("heads")) {
                totalNumberOfHeads = totalNumberOfHeads + 1;
            } else {
                totalNumberOfTails = totalNumberOfTails + 1;
            }
            System.out.println(" toss " + currentToss + " = " + penny.getSideUp());
        }
        System.out.println(" Out of " + numberOfTosses + " tosses, There are " + totalNumberOfHeads + " heads and " + totalNumberOfTails + " tails ");

        Coin quarter = new Coin();
        Coin dime = new Coin();
        Coin nickel = new Coin();
        double startingBalance = 0;

        while (startingBalance < 1) {
            quarter.toss();
            nickel.toss();
            dime.toss();

            if (quarter.getSideUp().equals("heads")) {
                startingBalance = startingBalance + ((double) 25 / 100);
            }

            if (dime.getSideUp().equals("heads")) {
                startingBalance = startingBalance + ((double) 10 / 100);
            }

            if (nickel.getSideUp().equals("heads")) {
                startingBalance = startingBalance + ((double) 5 / 100);
            }
        }

        if (startingBalance == 1) {
            System.out.println(" you win the game " + startingBalance);
        } else {
            System.out.println(" you lose the game " + startingBalance);
        }
    }

}

