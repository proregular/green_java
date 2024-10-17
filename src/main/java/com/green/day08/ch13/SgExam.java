package com.green.day08.ch13;

public class SgExam {
    public static void main(String[] args) {
        SgObj so = new SgObj("홍길동");

        System.out.println(so); // toString()메소드의 리턴값 "홍길동"이 출력된다.
    }
}

//모든 클래스는 무조건 Object를 상속받는다.
class SgObj {
    private String conts;

    SgObj(String conts) {
        this.conts = conts;
    }

    //오버라이딩 Overriding
    public String toString() {
        return conts;
    }
}
