package com.example.user.blackjack;

/**
 * Created by user on 16/12/2016.
 */
public class Card {

    private RankType rank;
    private SuitType suit; //Ace = 1, Jack-King = 11-13

    //Constructor maybe add int value below
    public Card(RankType rank, SuitType suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public RankType getRank() {
        return this.rank;
    }

    public SuitType getSuit() {
        return this.suit;
    }

    public int getRankValue() {
        if
                (rank.ordinal() <= 9) {
            return rank.ordinal() + 1;
        }
        else {
            return 10;
        }
    }

    public void printCard(){
        System.out.println(this.rank + " of " + this.suit);
    }

}