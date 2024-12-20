package com.green.day04.ch06;

public class MissionMethod {
    public static void main(String[] args) {
        printStar(5); // *****
        printStar(2); // **
        System.out.println("----------------------");
        printStarSquare(4);
        //****
        //****
        //****
        //****
        System.out.println("----------------------");
        printStarTriangle(4);
    }

    static void printStar(int star) {
        for(int i=0; i<star; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    static void printStarSquare(int star) {
        for(int i=0; i<star; i++) {
            printStar(star);
        }
    }

    static void printStarTriangle(int star) {
        for(int i=1; i<=star; i++) {
            printStar(i);
        }
    }
}
