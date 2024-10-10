package com.green.day03.ch05;

public class MissionWhile3 {
    public static void main(String[] args) {
        /*
        1000이하 자연수 중, 2의 배수이자 7의 배수인 수를 모두 출력하고,
        그 수들의 합을 구해서 출력하는 프로그램을 작성.
         */

        int n = 0, sum = 0;

        while(n <= 1000) {
            if((n % 2 == 0) && (n % 7 == 0)) {
                System.out.println(n);

                sum += n;
            }

            n++;
        }

        System.out.println("배수 합: " +  sum);
    }
}
