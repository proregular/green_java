package com.green.day16.ch26;

public class UseAnonymoseInnerOriginal {
    public static void main(String[] args) {
        Printable p = new PrintableImpl();

        p.print();
    }
}

class PrintableImpl implements Printable {
    @Override
    public void print() {
        System.out.println("이름있는 클래스 print");
    }
}
