package com.green.day04.ch05;

// p.135
public class Mssion05_7_1 {
    public static void main(String[] args) {
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
        //v1
        int n = 2;

        while(n <= 8) {
            for(int i=1; i<=n; i++) {
                System.out.printf("%d X %d = %d\n", n, i, (n*i));
            }
            n += 2;

            System.out.println();
        }
        //v2
        for(int i=2; i<=8; i+=2) {
            for(int z=1; z<=i; z++) {
                System.out.printf("%d X %d = %d\n", i, z, (i*z));
            }
            System.out.println();
        }
    }
}
