package com.green.day06.ch09;

public class GetterSetterExam {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("홍기르동그");
        System.out.println(s1.getName());

        Student s2 = new Student();

        s2.setName("신샤이무당으");
        System.out.println(s2.getName());
    }
}

class Student {
    private String name;
    private int age;
    private float height;

    //this는 상수이고 나 자신의 주소값이 저장된 공간

    // name-setter
    public void setName(String name) {
       this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    // name-getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getHeight() {
        return height;
    }
}
