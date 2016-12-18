package com.example.user.blackjack;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by user on 18/12/2016.
 */
public class Deck {
    private ArrayList<Card> deck;

    public Deck() {
        this.deck = new ArrayList<Card>();
        buildDeck();
    }

    public void buildDeck() {
        for (SuitType suit : SuitType.values()) {
            for (RankType rank : RankType.values()) {
                deck.add(new Card(rank, suit));
            }
        }
    }

    public ArrayList getDeck() {
        return this.deck;
    }

    public void shuffleDeck() {
        Collections.shuffle(deck);
    }

    public Card dealCard() {
        Card dealtCard = deck.remove(0);
        return dealtCard;
    }

    public void printDeck() {
        for (Card card : deck) {
            System.out.println(card.getRank() + " of " + card.getSuit());
        }
    }

    public int deckSize() {
        return deck.size();
    }
}
