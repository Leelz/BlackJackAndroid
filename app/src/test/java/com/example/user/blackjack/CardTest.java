package com.example.user.blackjack;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by user on 18/12/2016.
 */
public class CardTest {

    Card card;

    @Before
    public void before(){
        card = new Card(RankType.JACK, SuitType.HEARTS);
    }

    @Test
    public void canGetSuit() {
        assertEquals(SuitType.HEARTS, card.getSuit());
    }

    @Test
    public void canGetRank() {
        assertEquals(RankType.JACK, card.getRank());
    }

    @Test
    public void getRankValue() {
        assertEquals(10, card.getRankValue());
    }

    @Test
    public void canPrintCard() {
        card.printCard();
    }

}
