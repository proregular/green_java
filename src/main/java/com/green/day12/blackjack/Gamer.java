package com.green.day12.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    //Card객체 주소값 여러개 저장할 수 있어야 합니다.
    //ArrayList 사용할꺼임
    // 맴버필드 선언, 변수명은 cards
    protected final List<Card> cards;
    protected int point;

    public Gamer() {
        cards = new ArrayList();
    }

    public int getPoint() {
        return point;
    }

    public List<Card> openCards() {
        return cards;
    }

    public void showYourCards() {
        for(Card card : cards) {
            System.out.println(card);
        }
    }

    public void receiveCard(Card c) {
        String cDeno = c.getDenomination();

        this.point += switch(cDeno) {
            case "A" -> 1;
            case "J", "Q", "K" -> 10;
            default -> Integer.parseInt(cDeno);
        };

        cards.add(c);
    }
}
