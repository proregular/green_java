package com.green.day13;

import java.util.ArrayList;
import java.util.List;

public class ListStudy2 {
    public static void main(String[] args) {
        //Generic 제네릭
        //제네릭을 사용하면 실행시에 타입이 결정이 된다.
        //아래 3가지의 결과는 같다. 맘에드는 것 사용
        List<Integer> list = new ArrayList();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<Integer>();
        //list.add(""); //정수형 값만 들어갈 수 있는 ArrayList객체가 만들어짐
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(list.size());

        int n1 = list.get(0); //형변환 하지 않아도 된다.

        list.add(1, 60);
        System.out.println(list);
        System.out.println(list.size());

        list.remove(2);
        System.out.println(list);
        System.out.println(list.size());

        list.clear();
        System.out.println(list);
        System.out.println(list.size());
    }
}
