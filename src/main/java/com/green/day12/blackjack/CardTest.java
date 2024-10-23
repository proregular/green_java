package com.green.day12.blackjack;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();

        Card c = cardDeck.draw();
        Card c2 = cardDeck.draw();

        System.out.println("-----------------------");
        cardDeck.checkCard();
    }
}
