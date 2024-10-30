package com.green.day16.ch23;

import java.util.*;

public class HashMapCollection {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        
        map.put("홍길동" , "시계");
        map.put("권혜지" , "자바책");
        map.put("이정민" , "빈 캔");
        map.put("1", "ㅋㅋㅋㅋㅋ");
        map.put("홍길동" , "두번째 시계");

        System.out.println(map.get("1"));
        System.out.println(map.keySet());

        String v = map.get("홍길동");
        System.out.println("v: " + v);
    }
}
