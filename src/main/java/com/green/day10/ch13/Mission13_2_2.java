package com.green.day10.ch13;

import java.util.Arrays;

public class Mission13_2_2 {
    /*
        다음 형태로 표현된 2차원 배열이 존재한다고 가정해보자.
        1 2 3    >> 1행
        4 5 6    >> 2행
        7 8 9    >> 3행

        이러한 형태를 갖는 int형 2차원 배열이 인자로 전달되면,
        다음의 형태로 배열의 구조를 변경 시키는 메소드를 정의하자.
        7 8 9
        1 2 3
        4 5 6

        물론 배열의 가로와 세로 길이에 상관 없이 위와 같이 동작하도록 메소드를 정의 히야 한다.
     */
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {1, 1, 1}
        };

        System.out.println(Arrays.deepToString(arr));

        changeArrayOrder(arr);

        System.out.println(Arrays.deepToString(arr));

        //changeArrayOrder2(arr);

        //System.out.println(Arrays.deepToString(arr));
    }

    public static void changeArrayOrder(int[][] arr) {
        int[] tmp = arr[0]; // 마지막 값

        for(int i=0; i<arr.length - 1; i++) {
            arr[i] = arr[i+1];
        }

        arr[arr.length - 1] = tmp;
    }

    public static void changeArrayOrder2(int[][] arr) {
        int[] tmp = arr[arr.length -1]; // 마지막 값

        for(int i=arr.length - 1; i>0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = tmp;
    }
}
