package com.green.day12.blackjack;

import com.green.day07.ch07.Car;

import java.util.List;

public class CardTest {
    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();

        Card c = cardDeck.draw();
        Card c2 = cardDeck.draw();

        System.out.println("-----------------------");
        cardDeck.checkCard();
    }
}

class CardTest2 {
    public static void main(String[] args) {
        CardDeck cardDeck = new CardDeck();
        cardDeck.checkCard();
        Card c1 = cardDeck.draw();
        Card c2 = cardDeck.draw();
        Gamer gamer = new Gamer();
        gamer.receiveCard(c1); // 카드를 저장한다.
        gamer.receiveCard(c2);

        System.out.println("----------------------------");

        gamer.showYourCards();

        List<Card> list = gamer.openCards();
    }
}

class CardTest3 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        Gamer gammer = new Gamer();

        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.showYourCards();
        gammer.receiveCard(cd.draw());
        gammer.receiveCard(cd.draw());
        gammer.receiveCard(cd.draw());
        gammer.showYourCards();
        System.out.println(gammer.getPoint());
    }
}

class CardTest4 {
    public static void main(String[] args) {
        CardDeck cd = new CardDeck();
        Dealer dealer = new Dealer();
        Gamer gammer = new Gamer();
        Rule rule = new Rule();

        System.out.println("딜러: ");
        dealer.receiveCard(cd.draw());
        dealer.receiveCard(cd.draw());
        dealer.showYourCards();
        System.out.println(dealer.getPoint());
        System.out.println("----------------------");
        System.out.println("게이머: ");
        gammer.receiveCard(cd.draw());
        gammer.receiveCard(cd.draw());
        gammer.receiveCard(cd.draw());
        gammer.showYourCards();
        System.out.println(gammer.getPoint());
        System.out.println("----------------------");
        rule.getWinner(dealer, gammer);
    }
}
