package com.green.day04.ch05;

public class MissionForInFor5Result {
    public static void main(String[] args) {
        /*

         */
        int star = (int) (Math.random() * 6.0) + 3; // 3 ~ 8 사이의 랜덤 숫자

        System.out.println("star: " + star);

        for (int i=1; i<=star; i++) {
            for (int z=star; z>i; z--) {
                System.out.print("_");
            }
            for(int z=0; z<i; z++) {
                System.out.println("*");
            }
            System.out.println();
        }

        for(int i=star; i>0; i--) {
            for(int z=1; z<=star; z++) {
                System.out.print(z < i ? "-" : "*");
            }
            System.out.println();
        }
    }
}
