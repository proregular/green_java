package com.green.day06.ch07;

public class DupRef {
    public static void main(String[] args) {
        BankAccount ba = new BankAccount();
        BankAccount ba2 = ba; // 주소값 복사 == 얕은 복사 == Shallow Copy

        ba.deposit(1000);
        ba2.deposit(2000);

        ba.checkMyBalance();
    }
}
