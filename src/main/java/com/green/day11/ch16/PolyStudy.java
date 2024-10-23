package com.green.day11.ch16;
//다형성(polymorphism)
public class PolyStudy {
    /*
    다형성을 이해할 때 맴버필드도 이해해야하나 은닉화로 직접사용을 하지 않기 때문에
    멤버메소드 어떻게 동작하는지 이해하면 되다. 고로 아래 3가지만 기억하면 된다.
    1. 부모타입의 변수는 자식객체 주소값 저장할 수 있다.
    2. 1번의 반대는 안된다. 자식타입의 변수는 부모객체 주소값 저장할 수 없다.
    3. 타입은 호출할 수 있냐없냐(아는 메소드만 호출 가능, 모르는 메소드는 호출 불가)를 구분하고, 
       호출이 된다면 객체 기준.(우리가 원래 알던대로 동작).
       안다 모른다 구분은 해당 메소드를 가지고 있냐없냐로 구분 (상속 받은 메소드도 알고 있는 메소드)
    
    레퍼런스 변수끼리의 형변환이 가능한데 상속관계에서만 가능
    부모-자식 간에만 형변환 가능하지 형제끼리는 불가능
     */
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.crying(); //고양이가 운다~

        System.out.println("--------------------------------");
        //1번 검증
        Animal ani1 = new Cat();
        Animal ani2 = new Dog();
        Animal ani3 = new BullDog();
        Animal ani4 = new Bird();
        Dog dog1 = new BullDog();
        
        // 2번 검증
        //BullDog bullDog1 = new Dog(); //불가
        //BullDog bullDog = (BullDog)ani2; //런타임 에러 발생

        BullDog bullDog3 = (BullDog)dog1;

        // 3번 검증
        BullDog bullDog4 = (BullDog) ani3;
        bullDog4.jump(); //ani3에는 BullDog객체 주소값이 저장되어 있으나
        // Animal은 jump메소드를 모르기 때문에(존재하지않기 때문에) 호출할 수 없다.

        //instanceof: 형변환 가능여부, 가능 true, 불가능 false
        //가능: 타입과 동일한 객체이거나 자식 객체
        //불가능: 가능의 반대

        System.out.println(ani3 instanceof BullDog);
        System.out.println(ani3 instanceof Dog);
        System.out.println(ani4 instanceof BullDog);
        System.out.println(ani4 instanceof Bird);

        Cat cat2 = new Cat();
        Dog dog2 = new Dog();
        BullDog bullDog = new BullDog();
        Bird bird = new Bird();

        System.out.println("----------------------------------------");

        animalCrying(cat2);
        animalCrying(dog2);
        animalCrying(bullDog);
        animalCrying(bird);

        System.out.println("-- 끝 --");
    }

    public static void animalCrying(Animal ani) {
        ani.crying();

        if(ani instanceof BullDog) {
            ((BullDog)ani).jump();
        }
    }
}

class Animal {
    void crying() {
        System.out.println("동물이 운다~");
    }
}

class Cat extends Animal {
    @Override
    void crying() {
        System.out.println("야옹~ 야옹~");
    }
}

class Dog extends Animal {
    @Override
    void crying() {
        System.out.println("멍! 멍!");
    }
}

class BullDog extends Dog {
    @Override
    void crying() {
        System.out.println("월~ 월~");
    }

    void jump() {
        System.out.println("부르도기 저므프또 저므프또");
    }
}

class Bird extends Animal {
    @Override
    void crying() {
        System.out.println("까악~ 까악~");
    }
}