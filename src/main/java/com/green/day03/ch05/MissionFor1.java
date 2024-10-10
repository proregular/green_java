package com.green.day03.ch05;

public class MissionFor1 {
    public static void main(String[] args) {
        /* 1 부터 10까지의 곱의 결과를 출력하는 프로그램을 for문을 이용해서 작성 */
        int sum = 1;

        for(int i=1; i <=10; i++) {
            System.out.printf("%d x %d = %d \n", sum, i, sum * i);
            sum *= i;
        }

        System.out.println("sum: " + sum);
    }
}
