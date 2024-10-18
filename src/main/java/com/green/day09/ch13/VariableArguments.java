package com.green.day09.ch13;

import java.util.Arrays;

public class VariableArguments {
    public static void main(String[] args) {
        sum(1, 2);
        sum(10, 20, 33);

        sumVar(1);
        sumVar(1, 2);
        sumVar(1, 2, 3);
        sumVar(1, 2, 3, 4);
        sumVar(1, 2, 3, 4, 5);
    }

    static void sumVar(int... values) {
        int sum = 0;

        for(int i=0; i<values.length; i++) {
            sum += values[i];
        }

        System.out.println(sum);
    }

    static void sum(int n1, int n2) {
        sum(n1, n2, 0);
    }

    static void sum(int n1, int n2, int n3) {
        System.out.println(n1 + n2 + n3);
    }
}
