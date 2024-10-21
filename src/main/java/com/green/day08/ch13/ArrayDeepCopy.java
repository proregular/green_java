package com.green.day08.ch13;

public class ArrayDeepCopy {
    public static void main(String[] args) {
        int[] arr = {10, 15, 23, 1, 8, 10, 12, 100, 222, 333};
        int[] copyArr = new int[arr.length];

        for(int i=0; i<arr.length; i++) {
            copyArr[i] = arr[i];
        }

        System.out.println("arr == copyArr: " + (arr == copyArr)); //false
        //참조변수끼리의 == 비교는 동일성(같은 주소값)을 묻는다.

        int[] arr2 = copyArr; //얕은 복사(주소값 복사)
        System.out.println("arr2 == copyArr: " + (arr2 == copyArr)); //true

        //밑은 절대 건들지 마시오!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        for(int i=0; i<arr.length; i++) {
            System.out.printf("arr[%d]: %d\n", i, arr[i]);
        }
        System.out.println("--------------------------");
        for(int i=0; i<copyArr.length; i++) {
            System.out.printf("arr[%d]: %d\n", i, copyArr[i]);
        }
    }
}