package com.green.day05.ch06;

public class Mission06_2_1 {
    /*
        인자로 원의 반지름 정보를 전달하면, 원의 넓이를 계산하여 반환하는
        메소드와 원의 둘레를 계산하여 반환하는 메소드를 각각 정의하고,
        이 둘을 호출하는 main메소드를 정의 하자
    */
    static double calCicle1(double n) {
        return 3.14 * n * n;
    }

    static double calCicle2(double n) {
        return 2 * 3.14 * n;
    }

    public static void main(String[] args) {
        double r1, r2;

        r1 = calCicle1(17);
        r2 = calCicle2(17);

        System.out.println("원의 넓이: " + r1);
        System.out.println("원의 둘레: " + r2);
    }
}
