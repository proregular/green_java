package com.green.day02.ch05;

import java.util.Scanner;

public class MissionIf3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 하나 입력하세요 >> ");
        int input = scan.nextInt();
        System.out.printf("input: %d\n", input);

        // 11는(은) 홀수입니다.

        // 14는(은) 짝수입니다.

        String result = "홀";

        if((input % 2) == 0) {
            result = "짝";
        }

        System.out.printf("%d는(은) %s수입니다.\n", input, result);

        System.out.println("--끝--");



    }
}