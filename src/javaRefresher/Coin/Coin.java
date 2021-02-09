package javaRefresher.Coin;

import java.util.Random;

public class Coin {

    private String sideUp;

    // default constructor, method 3
    public Coin() {
        toss();
    }

    // method 1, using random object, for random side
    public void toss() {
        Random rand = new Random();
        int randomSide;
        randomSide = rand.nextInt(2);
        // It should set the sideUp field to heads or tails
        if( randomSide == 1) {
            sideUp = "heads";
        } else {
            sideUp = "tails";
        }
    }
    //method 2 return the side of the coin facing up
    public String getSideUp() {
        return sideUp;
    }


}


