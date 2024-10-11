package com.green.day04.ch06;

public class MethodRelationalOp {
    public static void main(String[] args) {
        int n1 = 11, n2 = 22;
        biggerNumber(n1, n2); // 더 큰 값은 22 입니다.
        biggerNumber(30, 11); // 더 큰 값은 30 입니다.
        biggerNumber(130, 111); // 더 큰 값은 30 입니다.

        if(isEquals(n1, n2)) {
            System.out.printf("%d와 %d 값은 같습니다.\n", n1, n2);
        }
        System.out.println("--끝--");
    }

    static void biggerNumber(int n1, int n2) {
        System.out.printf("더 큰 값은 %d 입니다.\n", (n1 > n2 ? n1 : n2));
    }

    static boolean isEquals(int n1, int n2) {
        return n1 == n2;
    }
}
