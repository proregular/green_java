package com.green.day13;

public class MyListTest {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        System.out.println(list.size());
        list.add(10);
        System.out.println(list);
        System.out.println(list.size());
        list.add(20);
        System.out.println(list);
        System.out.println(list.size());
        list.add(30);
        System.out.println(list);
        System.out.println(list.size());
        list.add(40);
        System.out.println(list);
        System.out.println(list.size());
        list.clear();
        System.out.println(list);
        System.out.println(list.size());
    }
}

class MyArrayListTest2 {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list); // [10, 20, 30]

        int removeValue = list.remove();
        //마지막방에 있는 값은 리턴
        //마지막방도 없애야 함, 즉 size()는 3이 되어야 함
        System.out.println(list); // [10, 20, 30]
        System.out.println("list.size(): " +  list.size());
        System.out.println("removeValue: " + removeValue);
    }
}
