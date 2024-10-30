package com.green.day16.ch26;
//p.653
//익명 클래스
public class UseAnonymouseInner {
    public static void main(String[] args) {
        //익명클래스
        Printable p = new Printable() {
            @Override
            public void print() {
                System.out.println("익명클래스 print");
            }
        };
        /*
        () 파라미터 부분
        -> 람다식 시작부분
         */

        Printable p2 = () -> System.out.println("람다 print");

        p.print();
        p2.print();
    }
}
//인터페이스는 객체화가 불가능
//추상 메소드 하나만 가지고 있는 interface만 람다식을 사용할 수 있다.
@FunctionalInterface
interface Printable {
    void print();
}
