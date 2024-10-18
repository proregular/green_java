package com.green.day09.ch13;

public class MyArrays {
    public static String toString(int[] arr) {
        String str = "[";

        for (int i=0; i<arr.length; i++) {
            str += arr[i] + (i < (arr.length-1) ? ", " : "");
        }

        str += "]";

        return str;
    }

    public static int[] copyOf(int[] arr) {
        return copyOf(arr, arr.length);
    }

    public static int[] copyOf(int[] arr, int len) {
        if(len > arr.length) {
            len = arr.length;
        }
        int[] copyArr = new int[len];

        for(int i=0; i<len; i++) {
            copyArr[i] = arr[i];
        }

        return copyArr;
    }



    public static String toString2(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        int lastIdx = arr.length -1;

        for (int i=0; i<arr.length; i++) {
            sb.append(arr[i] + (i < lastIdx ? ", " : ""));
        }

        return sb.append("]").toString();
    }

    public static String toString3(int[] arr) {
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<arr.length; i++) {
            if(i != 0) {
                sb.append(", ");
            }
            sb.append(arr[i]);
        }

        return "[" + sb + "]";
    }

    public static String toString4(int[] arr) {
        if(arr.length == 0) {
            return "[]";
        }

        StringBuilder sb = new StringBuilder("[");

        sb.append(arr[0]);

        for (int i=1; i<arr.length; i++) {
            sb.append(", ");
            sb.append(arr[i]);
        }

        return sb.append("]").toString();
    }
}
