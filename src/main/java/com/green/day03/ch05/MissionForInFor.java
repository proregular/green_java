package com.green.day03.ch05;

public class MissionForInFor {
    public static void main(String[] args) {
        /*
        중첩 for문을 이용하여 구구단을 출력해 주세요.
         */
        for(int i=2; i<=9; i++) {
            for(int z=1; z<=9; z++) {
                System.out.printf("%d x %d = %d\n", i, z, i*z);
            }
            System.out.println();
        }
    }
}
