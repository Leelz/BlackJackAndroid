package com.example.user.blackjack;

import java.util.ArrayList;

/**
 * Created by user on 16/12/2016.
 */
public class Hand {

    private ArrayList<Card> hand;

    public Hand() {
        this.hand = new ArrayList<Card>();
    }

    public ArrayList getHand(){
        return this.hand;
    }

    public void addDealtCardToHand(Card dealtCard){
        hand.add(dealtCard);
    }

    public int getValue() {
        int total = 0;
        for (Card card : hand) {
            total += card.getRankValue();
        }
        return total;
    }

}
