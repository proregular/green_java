package com.green.day16.ch26;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        Integer[] arr = { 10, 200, 30, 40 };

        // 배열 안에서 가장 큰 숫자 리턴
        Function<Integer[], Integer> fn = arr2 -> {
            Integer maxV = arr2[0];

            for(int i=1; i<arr2.length; i++) {
                if(arr2[i] > maxV) {
                    maxV = arr2[i];
                }
            }

            return maxV;
        };

        int maxValue = fn.apply(arr);
        System.out.println("maxValue: " + maxValue);
    }
}
