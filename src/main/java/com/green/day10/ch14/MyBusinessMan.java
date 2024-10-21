package com.green.day10.ch14;

public class MyBusinessMan {
    public static void main(String[] args) {
        BusinessMan man1 = new BusinessMan("YOON", "Hybrid ELD", "Staff Eng.");
        System.out.println(man1.getName());

        man1.tellYourSelf();
        // BusinessMan 클래스 안에는 tellYourSelf메소드가 없지만 호출할 수 있다.
        // Man 클래스로부터 상속 받았기 때문이다.
        System.out.println(man1.toString());
        // 같은 이유로 Object 클래스로부터 상속받았기 때문에 toString메소드 호출할 수 있다.

        man1.jump();
        man1.whatIsDoing();
        // man1.super.jump(); // 외부에서 this, super 사용할 수 없다. (상속관계 내부에서 사용)
    }
}

// 상속 키워드를 생략하면 extends Object가 자동으로 붙는다.
// 모든 클래스는 최상위 부모로 Object를 갖는다.
// 모근 클래스의 최상위 부모는 Object이다.
class Man {
    private String name;

    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void tellYourSelf() {
        System.out.printf("제 이름은 %s입니다.\n", name);
    }

    public void jump() {
        System.out.printf("%s(이)가 점프!\n", name);
    }
}

class BusinessMan extends Man {
    private String company;
    private String position;

    public BusinessMan(String name, String company, String position) {
        super(name);
        this.company = company;
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public String getPosition() {
        return position;
    }

    // 오버라이딩: 부모가 가진 메소드를 사용하는 것이 아니라 내가 재정의한 메소드를 사용하게끔 하는 기법
    public void jump() {
        System.out.printf("%s에 다니는 %s(이)가 점프!\n", company, getName());
        //name은 private이기 때문에 바로 접근할 수 없다.
        //public 으로 상속받은 getName 메소드를 호출하여 이름값을 얻는다.
    }

    public void whatIsDoing() {
        super.jump(); // 부모가 가지고 있는 메소드를 호출하고 싶으면 super. 을 이용하면 된다.
    }

}
