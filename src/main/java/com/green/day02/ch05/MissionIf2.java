package com.green.day02.ch05;

public class MissionIf2 {
    public static void main(String[] args) {
        int score = (int)(Math.random() * 101.0); //0~100사이의 랜덤값 나올 수 있도록 세팅
        System.out.printf("score: %d\n", score);

        /*
        score값이 90이상이면 A 출력
                 80이상이면 B 출력
                 70이상이면 C 출력
                 나머지 D 출력
         */

        if(score >= 90) {
            System.out.println("A");
        } else if(score >= 80) {
            System.out.println("B");
        } else if(score >= 70) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }

        // 다른 방법
        String rank = "D";

        if(score >= 90) {
            rank = "A";
        } else if(score >= 80) {
            rank = "B";
        } else if(score >= 70) {
            rank = "C";
        }

        System.out.println(rank);
    }
}
