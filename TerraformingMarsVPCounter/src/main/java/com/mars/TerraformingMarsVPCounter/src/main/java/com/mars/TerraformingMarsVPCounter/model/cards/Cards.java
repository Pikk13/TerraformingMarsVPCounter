package com.mars.TerraformingMarsVPCounter.model.cards;

public class Cards {

    public static int cardPoints(String cardName) {
        int score = 0;

        if (cardName.equals("dust seals")) {
            score = 2;
        }

        return score;
    }
}
