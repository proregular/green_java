package com.green.day04.ch06;

public class MethodGugudan {
    public static void main(String[] args) {
        gugudan(4);

        System.out.println("-------------------");

        gugudan(6);

        System.out.println("===============================");

        gugudanFromTo(5, 9); // 5~9단 까지 출력

        System.out.println("===============================");

        gugudanFromTo(3, 4); // 5~9단 까지 출력
    }

    static void gugudan(int dan) {
        for(int i=1; i<=9; i++) {
            System.out.printf("%d x %d = %d\n", dan, i, (dan * i));
        }
    }

    static void gugudanFromTo(int from, int to) {
        for(int dan=from; dan<=to; dan++) {
            gugudan(dan);
            System.out.println();
        }
    }
}
