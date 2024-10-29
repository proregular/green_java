package com.green.day15.ch21;

public class BoxInBox {
    public static void main(String[] args) {
        BoxGeneric<String> sBox = new BoxGeneric<>("I am so happy.");

        BoxGeneric<BoxGeneric<String>> wBox = new BoxGeneric<>(sBox);

        BoxGeneric<BoxGeneric<BoxGeneric<String>>> zbBox = new BoxGeneric<>(wBox);

        BoxGeneric <BoxGeneric<String>> wBox2 = zbBox.getBox();

        BoxGeneric<String> sBox2 = wBox2.getBox();

        System.out.println("wBox == wBox2 : " + (wBox == wBox2));// false

    }
}


