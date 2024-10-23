package com.green.day12.blackjack;

public class CardDeck {
    //Card 객체 주소값 52개를 저장할 수 있어야 한다.
    private final Card[] cards;
    private final String[] patterns;
    private int seletedIdx = 0; //외부에 줘야할 카드의 index 값

    public void setSeletedIdx(int n) {
        this.seletedIdx = n;
    }

    public CardDeck() {
        cards = new Card[52];
        patterns = new String[]{"Diamond", "Heart", "Clova", "Spade"};

        //미션1 "", "" 값을 가지고 있는 Card객체를 52개를 만들어 주시고
        // cards 배영에 하나씩 넣어주세요.
        int cardIdx = 0;

        for(int i=0; i<patterns.length; i++) {
            for(int z=1; z<=13; z++) {
                cards[cardIdx++] = new Card(patterns[i], getDenomination(z));
            }
        }

        // 섞어주세요
        shuffle();

        //enhanced-for문으로 card객체 주소값 출력
        for(Card item : cards) {
            System.out.println(item);
        }
    }

    public void checkCard() {
        for (Card c : cards) {
            System.out.println(c);
        }
    }

    public Card draw() {
        if(seletedIdx >= cards.length) {
            return null;
        }

        Card seletedCard = cards[seletedIdx];
        cards[seletedIdx++] = null;

        return seletedCard;
    }

    private void shuffle() {
        for(int i=0; i<cards.length; i++) {
            int rIdx = (int)(Math.random() * cards.length);
            Card tmp = cards[i];
            cards[i] = cards[rIdx];
            cards[rIdx] = tmp;
        }
    }

    public String getDenomination(int n) {
        String str = "";

        if(n >= 2 && n <= 10) {
            str += n;
        } else {
            switch (n) {
                case 1:
                    str = "A";
                    break;
                case 11:
                    str = "J";
                    break;
                case 12:
                    str = "Q";
                    break;
                case 13:
                    str = "K";
                    break;
            }
        }

        return str;
    }

    public String getDenominationR(int n) {
        if(n < 1 || n > 13) {
            return "";
        }

        switch(n) {
            case 1:
                return "A";
            case 10:
                return "J";
            case 11:
                return "Q";
            case 12:
                return "K";
            default:
                return String.valueOf(n);
        }
    }
}
