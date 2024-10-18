package com.green.day09.ch13;

public class EnhancedForInst {
    public static void main(String[] args) {
        Product[] arr = new Product[4];
        arr[0] = new Product("Coffe", 5_000);
        arr[1] = new Product("Computer", 1_000_000);
        arr[2] = new Product("Apple", 7_000);
        arr[3] = new Product("Dress", 400_000);

        // 미니 미션 아래 포맷처럼 출력되도록 해주세요.
        //System.out.println(arr[0]); //제품명:Coffee, 가격:5000원

        /*
        enhanced-for문을 사용하여 제품명, 가격을 콘솔에 출력하고
        모든 제품의 가경을 더한값을 출력해 주세요.
         */
        int priceSum = 0;

        for(Product item : arr) {
            System.out.println(item);
        }

        for(Product item : arr) {
            priceSum += item.getPrice();
        }

        System.out.printf("Total: %,d\n", priceSum);

        // 배열에서 제품명이 Apple인 것만 찾아서 콘솔에 출력
        for(Product item : arr) {
            if(item.getName().equals("Apple")) {
                System.out.println(item);
            }
        }

        System.out.println("Apple" == "Apple");
        StringBuilder s1 = new StringBuilder("Apple");
        StringBuilder s2 = new StringBuilder("Apple");

        System.out.print(s1 == s2);
    }
}

class Product {
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return String.format("제품명: %s, 가격: %,d원", name, price);
    }
}
