package com.green.day07.ch10;

public class ClassVar {
    public static void main(String[] args) {
        InstCnt ic1 = new InstCnt();
        InstCnt ic2 = new InstCnt();
        InstCnt ic3 = new InstCnt();
    }
}

class InstCnt {
    static int instNum;
    int value;
    InstCnt() {
        instNum++;

        // 같은 의미 이다.
        System.out.println("인스턴스 생성: " + InstCnt.instNum);
        System.out.println("인스턴스 생성: " + instNum);

        System.out.println("value: " + value);
    }
}
