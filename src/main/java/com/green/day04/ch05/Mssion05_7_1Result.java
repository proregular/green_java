package com.green.day04.ch05;

// p.135
public class Mssion05_7_1Result {
    public static void main(String[] args) {
        for(int dan=2; dan<=8; dan+=2) {
            for(int i=1; i<=dan; i++) {
                System.out.printf("%d X %d = %d\n", dan, i, (dan*i));
            }
            System.out.println();
        }
        /*
        1번. 구구단의 짝수 단인 2, 4, 6, 8 단만 출력하는 프로그램을 
        작성하되 
        2단은 2 x 2까지, 
        4단은 4 x 4 까지,
        .
        .
        .
        출력되도록 작성하자
         */
    }
}
