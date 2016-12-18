package com.example.user.blackjack;

/**
 * Created by user on 18/12/2016.
 */
public class Game {
    public static void main(String[] args) {

        System.out.println("Hi, let's play Black Jack!");

        System.out.println("What is your name?");

        String name = System.console().readLine();

        Deck deck = new Deck();
        deck.buildDeck();
        deck.shuffleDeck();

        Hand playerHand = new Hand();
        Hand dealerHand = new Hand();
        Player player = new Player(name, playerHand);
        Dealer dealer = new Dealer();

        System.out.println("Deal to " + name + ":");
        playerHand.addDealtCardToHand(deck.dealCard());
        System.out.println("Dealers card: ");
        dealerHand.addDealtCardToHand(deck.dealCard());
        System.out.println("Deal to " + name + ":");
        playerHand.addDealtCardToHand(deck.dealCard());
        System.out.println("Dealers card: ");
        dealerHand.addDealtCardToHand(deck.dealCard());

        System.out.println("You have a hand value of " + playerHand.getValue());
        System.out.println("Would you like to 'Stick' or 'Twist'?");

        String action = System.console().readLine();

        if (action.equals("Twist")) {
            System.out.println("Deal to " + name + ":");
            playerHand.addDealtCardToHand(deck.dealCard());
            System.out.println("You have a hand value of " + playerHand.getValue());
        }

        System.out.println("The dealer has a hand value of " + dealerHand.getValue());

        if (playerHand.getValue() > 21) {
            System.out.println("Bust - You lose!");
        } else if (dealerHand.getValue() > 21) {
            System.out.println("Dealer is Bust - You Win!");
        } else if (playerHand.getValue() > dealerHand.getValue()) {
            System.out.println("You win");
        } else {
            System.out.println("You lose");
        }
    }
}
