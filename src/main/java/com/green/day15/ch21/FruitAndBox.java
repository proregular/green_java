package com.green.day15.ch21;
//p.408
//Generic이 없던 시절
public class FruitAndBox {
    public static void main(String[] args) {
        AppleBox appleBox = new AppleBox(new Apple());
        OrangeBox orangeBox = new OrangeBox(new Orange());

    }
}

class Apple {
    @Override
    public String toString() {
        return "사과";
    }
}

class Orange {
    @Override
    public String toString() {
        return "오렌지";
    }
}

class AppleBox {
    private Apple ap;

    //private한 맴버필드에 값 넣는 방법 2가지
    //1. 생성자
    //2. setter메소드
    
    public AppleBox(Apple ap) {
        this.ap = ap;
    }

    //메소드를 통해 ap값을 외부로 리턴 할 수 있다.
    public Apple getAp() {
        return ap;
    }
}

class OrangeBox {
    private Orange orange;

    public OrangeBox(Orange orange) {
        this.orange = orange;
    }

    public Orange getOrange() {
        return orange;
    }
}
