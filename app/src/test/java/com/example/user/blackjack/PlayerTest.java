package com.example.user.blackjack;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by user on 18/12/2016.
 */
public class PlayerTest {

    Player player;
    Hand hand;
    Card card;

    @Before
    public void before(){
        hand = new Hand();
        player = new Player("Snoop", new Hand());
        card = new Card(RankType.JACK, SuitType.HEARTS);
    }

    @Test
    public void hasName() {
        assertEquals("Snoop", player.getName());
    }

}
