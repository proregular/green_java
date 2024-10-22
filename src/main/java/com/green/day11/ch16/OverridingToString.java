package com.green.day11.ch16;

public class OverridingToString {
    public static void main(String[] args) {
        Cake c = new Cake();
        System.out.println(c);
        CheeseCake cheeseCake = new CheeseCake();
        System.out.println(cheeseCake);

        Cake c2 = cheeseCake;
        System.out.println(c2);
    }
}

class Cake {
    @Override // 오버라이딩 실수 방지용
    public String toString() {
        return "My birthday cake";
    }

    final void blowCandle() { // final을 붙이면 오버라이딩 금지!
        System.out.println("초를 분다.");
    }
}

class CheeseCake extends Cake {
    @Override
    public String toString() {
        return "My birthday chees cake";
    }
}
