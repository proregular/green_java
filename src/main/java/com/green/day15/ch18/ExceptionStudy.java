package com.green.day15.ch18;

public class ExceptionStudy {
    public static void main(String[] args) {
        String str1 = "123";
        int intVal1 = myParseInt(str1);
        System.out.println("intVal1: " + intVal1);

        String str2 = "1a23";
        int intVal2 = myParseInt(str2);
        System.out.println("intVal2: " + intVal2);
    }

    public static int myParseInt(String s) {
        try {
            return Integer.parseInt(s);
        } catch(Exception e) {
            return 0;
        }
    }
}
