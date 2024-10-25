package com.green.day12.blackjack;

public class Rule {
    public static final int MAX_POINT = 21; // 기준 점수(Standard_Point)

    public void getWinner(Dealer dealer, Gamer gamer) {
        //1. 각 게이머(게이머, 딜러)의 점수를 얻을 수 있어야 한다.
        //2. 값을 비교해서 누가 이겼는지 출력
        //3. 비겼다 or 누가 이겼다.

        //비겼는 경우: 둘의 값이 같을 경우, 둘 다 21을 넘어선 경우

        int dealerP = dealer.getPoint();
        int gammerP = gamer.getPoint();
        // 비긴 경우 먼저 체크
        if((dealerP > 21 && gammerP > 21) || (dealerP == gammerP)) {
            System.out.println("비겼습니다.");
            return;
        } else if(dealerP > 21) {
            System.out.println("게이머가 이겼습니다.");
            return;
        } else if(gammerP > 21) {
            System.out.println("딜러가 이겼습니다.");
            return;
        }
        
        System.out.println((dealerP > gammerP ? "딜러": "게이머") + "가 이겼습니다.");
    }

    public void getWinnerR(Dealer dealer, Gamer gamer) {
        //1. 각 게이머(게이머, 딜러)의 점수를 얻을 수 있어야 한다.
        //2. 값을 비교해서 누가 이겼는지 출력
        //3. 비겼다 or 누가 이겼다.

        //비겼는 경우: 둘의 값이 같을 경우, 둘 다 21을 넘어선 경우
        int dealerP = dealer.getPoint();
        int gammerP = gamer.getPoint();

        if((dealerP > MAX_POINT && gammerP > MAX_POINT) || (dealerP == gammerP)) {
            System.out.println("비겼습니다.");
        } else if((dealerP <= MAX_POINT && dealerP > gammerP) || gammerP > MAX_POINT) {
            System.out.println("딜러가 이겼습니다.");
        } else {
            System.out.println("게이머가 이겼습니다.");
        }
    }
}
