package com.example.user.blackjack;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by user on 18/12/2016.
 */
public class DeckTest {

    Deck deck;

    @Before
    public void before(){
        deck = new Deck();
    }

    @Test
    public void canBuildDeck() {
        assertEquals(52, deck.deckSize());
    }

    @Test
    public void deckCanShuffle() {
        deck.printDeck();
        deck.shuffleDeck();
        deck.printDeck();
    }

    @Test
    public void canRemoveCardFromDeck() {
        deck.dealCard();
        assertEquals(51, deck.deckSize());
    }

}
