package com.green.day13;

public class MyArrayList {
    private int[] arr;

    public MyArrayList() {
        clear();
    }

    public int remove() {
        if(arr.length == 0) {
            return 0;
        }

        int[] nArr = new int[arr.length - 1];
        int rVal = arr[nArr.length];

        for(int i=0; i<nArr.length; i++) {
            nArr[i] = arr[i];
        }

        arr = nArr;

        return rVal;
    }

    public void clear() {
        arr = new int[0];
    }

    public int size() {
        return arr.length;
    }

    public void add(int n) {
        int[] nArr = new int[arr.length + 1];

        for(int i=0; i<arr.length; i++) {
            nArr[i] = arr[i];
        }

        nArr[arr.length] = n;
        arr = nArr;
    }

    @Override
    public String toString() {
        String str = (arr.length != 0) ? String.valueOf(arr[0]) : "";

        for (int i = 1; i < arr.length; i++) {
            str += ", " + arr[i];
        }

        return "[" + str + "]";
    }

    public String toStringR() {
        StringBuilder sb = new StringBuilder((arr.length != 0) ? "[" + String.valueOf(arr[0]) : "[");

        for (int i = 1; i < arr.length; i++) {
            sb.append(", " + arr[i]);
        }

        return sb.append("]").toString();
    }
}
