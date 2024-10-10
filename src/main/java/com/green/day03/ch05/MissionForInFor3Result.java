package com.green.day03.ch05;

public class MissionForInFor3Result {
    public static void main(String[] args) {
        int star = (int)(Math.random() * 6.0) + 3; // 3 ~ 8 사이의 랜덤 숫자

        System.out.println("star = " + star);

        for(int i=0; i<star; i++) {
            for(int j=0; j<star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("-------------------------------");

        int len = star * star;

        for(int i=1; i<=len; i++) {
            System.out.print("*");

            if(i % star == 0) {
                System.out.println();
            }
        }
    }
}
