package com.green.day12.blackjack;

import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        System.out.println("============= BlackJack =============");
        CardDeck cd = new CardDeck();
        Rule rule = new Rule();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<2; i++) {
            gamer.receiveCard(cd.draw());
            dealer.receiveCard(cd.draw());
        }

        // 딜러가 16점 이하면 카드를 한장 더 받을 수 있도록 해주세요.
        dealer.needMoreCard(cd);

        while(true) {
            System.out.println("---------------------");
            gamer.showYourCards();
            System.out.println("카드를 추가하시겠습니까?(종료: n)");
            String input = scan.nextLine();

            if(input.equals("n")) {
                break;
            }

            gamer.receiveCard(cd.draw());
        }
        System.out.println("-- 딜러의 카드 --");
        dealer.showYourCards();

        rule.getWinner(dealer, gamer);

        System.out.println("게임 끝!!");
    }
}
