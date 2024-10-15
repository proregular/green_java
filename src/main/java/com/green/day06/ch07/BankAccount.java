package com.green.day06.ch07;

public class BankAccount {
    int balance = 0;

    void deposit(int amount) { // 입금을 담당하는 메소드
        balance += amount;
    }

    void withdraw(int amount) {
        balance -= amount;
    }

    void checkMyBalance() {
        System.out.printf("balance: %d\n", balance);
    }
}
