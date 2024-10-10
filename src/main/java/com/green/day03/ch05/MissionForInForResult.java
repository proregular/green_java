package com.green.day03.ch05;

public class MissionForInForResult {
    public static void main(String[] args) {
        /*
        중첩 for문을 이용하여 구구단을 출력해 주세요.
         */
        for(int dan=2; dan<=9; dan++) {
            for(int i=1; i<=9; i++) {
                System.out.printf("%d x %d = %d\n", dan, i, dan*i);
            }
            System.out.println();
        }
    }
}
