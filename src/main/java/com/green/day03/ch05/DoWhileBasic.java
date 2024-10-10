package com.green.day03.ch05;

public class DoWhileBasic {
    public static void main(String[] args) {
        /*
        while문은 반복하기 전에 먼저 ()안의 결과가 true인지 체크 먼저 한다.
        체크 후에 true면 반복 시작
        
        do-while문은 실행 1번 먼저하고 ()안의 결과가 true인지 체크한다.
        체크 후에 true면 반복 시작
         */
        int n = 5;

        while(n < 5) {
            System.out.println("I Like Java " + (n++));
        }

        System.out.println("-----------------");

        int n2 = 5;

        do {
            System.out.println("I Like Java " + (n2++));
        } while(n2 < 5);

        System.out.println("--끝--");
    }
}
