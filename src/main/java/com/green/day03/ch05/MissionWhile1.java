package com.green.day03.ch05;

public class MissionWhile1 {
    public static void main(String[] args) {
        /*
        while문을 활용하여 1~99까지의 합을 구하는 프로그램을 작성하시오.
         */

        int n = 1, result = 0;

        while(n < 100) {
            result += n++;
        }

        System.out.println("1~99까지의 합: " + result);
    }
}
