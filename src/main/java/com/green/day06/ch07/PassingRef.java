package com.green.day06.ch07;

public class PassingRef {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();

        ba.deposit(1000);
        ba.deposit(2000);

        BankAccount ba2 = ba; // 주소값 복사 == 얕은 복사 == Shallow Copy

        ba2.checkMyBalance();
        ba.checkMyBalance();

        ba2 = null; // null의 의미는 객체를 가르키고 있지 않다.(주소값 없다)
        if(ba2 != null) { // null 체크
            ba2.checkMyBalance();
        }
        // null인 상태에서 메소드 호출을 하면 NullPointException이 발생된다.
        // null인 상태에서 메소드 호출을 하면 안된다.
        
        //ba2 = new BankAccount(); // 새롭게 주소값을 저장할 수 있다. 왜? 변수기 때문에

        check(ba);
    }

    static void check(BankAccount ba) {
        ba.checkMyBalance();    // balance: 1000
    }
}
