package com.green.day15.ch21;

public class FruitAndBox2Generic {
    public static void main(String[] args) {
        BoxGeneric<Apple> appleBox = new BoxGeneric<>(new Apple());
        Apple apple = appleBox.getBox();

        BoxGeneric<Orange> orangeBox = new BoxGeneric<>(new Orange());
        Orange orange = orangeBox.getBox();

        //new 부분에 <>를 생략하면 객체는 타입이 제네릭의 타입은 Object가 되는거 같음.
        //타입에 적은<Orange>로 형변환을 하는것으로 예상됨.
        // new 부분에 <>를 작성하는 것이 성능에 도움이 된다.
        BoxGeneric<Orange> orangeBox2 = new BoxGeneric(new String());
        orangeBox2.getBox();
        //FruitBoxGeneric<Orange> orangeBox3 = new FruitBoxGeneric<>(new String());

        System.out.println(apple);
        System.out.println(orange);

    }
}



class BoxGeneric<T> {
    private T fruit;

    BoxGeneric(T fruit) {
        this.fruit = fruit;
    }

    T getBox() {
        return fruit;
    }
}