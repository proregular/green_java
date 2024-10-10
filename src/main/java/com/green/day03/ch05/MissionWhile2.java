package com.green.day03.ch05;

public class MissionWhile2 {
    public static void main(String[] args) {
        /*
        1 - 100 까지 출력,
        100 - 1 까지 출력

        do-while, while 각 1번씩 사용하여 해결해 주세요.
         */

        int n = 0;

        while(n < 100) {
            System.out.println(++n);
        }

        System.out.println("-----------------------------");

        do {
            System.out.println(n--);
        }while(n > 0);

        System.out.println("-------------끝--------------");
        
        do {
            System.out.println(++n);
        } while(n < 100);

        System.out.println("-----------------------------");

        while(n > 0) {
            System.out.println(n--);
        }
    }
}
