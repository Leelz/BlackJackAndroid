package com.example.user.blackjack;

/**
 * Created by user on 16/12/2016.
 */
public class Player {

    String name;
    Hand hand;

    //Constructor
    public Player(String name, Hand hand) {
        this.name = name;
        this.hand = hand;
    }

    public String getName() {
        return this.name;
    }

    public Hand getHand() {
        return this.hand;
    }

    public int handSize(){
        return hand.getHand().size();
    }

    public int getHandValue() {
        return hand.getValue();
    }

}