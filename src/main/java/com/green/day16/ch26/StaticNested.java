package com.green.day16.ch26;

public class StaticNested {
    public static void main(String[] args) {
        Outer.Nested1 nst1 = new Outer.Nested1();
        nst1.add(10);
        nst1.add(2);
    }
}

class Outer {
    private static int num;

    static class Nested1 {
        void add(int val) {
            num += val;
        }
    }

    static class Nested2 {
        int get() { return num; }
    }
}


