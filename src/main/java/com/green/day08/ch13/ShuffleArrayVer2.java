package com.green.day08.ch13;

import java.util.Arrays;

public class ShuffleArrayVer2 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int[] tempArr = new int[arr.length]; //임시로 저장(같은 자리에 원래 있던 숫자가 들어가는 것을 방지 하기 위함)

        //1~20순차적으로 값을 넣어주세요.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        //초기값 기억을 위해 저장
        for (int i = 0; i < arr.length; i++) {
            tempArr[i] = arr[i];
        }

        while(true) {
            // 0 ~ 19 랜덤값
            for(int i = 0; i < arr.length; i++) {
                int rIdx = (int)(Math.random() * arr.length);
                int temp = arr[i];
                arr[i] = arr[rIdx];
                arr[rIdx] = temp;
            }

            String dupNum = ""; // 중복된 숫자를 표시하기 위한 변수

            for(int i=0; i<arr.length; i++) {
                if(tempArr[i] == arr[i]) {
                    dupNum += " " + arr[i];
                }
            }

            if(dupNum != "") {
                System.out.println("중복된 값:" + dupNum);
                System.out.println("arr:     " + Arrays.toString(arr));
                System.out.println("tempArr: " + Arrays.toString(tempArr));
            } else {
                break;
            }
        }

        System.out.println("--------------------------------------------------------------------------");
        System.out.println("중복 없이 성공한 값: ");
        System.out.println("arr:     " + Arrays.toString(arr));
        System.out.println("tempArr: " + Arrays.toString(tempArr));
    }
}
