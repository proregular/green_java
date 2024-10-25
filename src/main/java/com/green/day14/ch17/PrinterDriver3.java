package com.green.day14.ch17;

public class PrinterDriver3 {
    public static void main(String[] args) {
        //Printable은 ColorPrintable보다 부모타입이기 때문에 담을 수 없다.
        //ColorPrintable cp = (ColorPrintable)new Prn204Drv();
        //cp.printCMYK("ddd");
    }
}

interface ColorPrintable extends Printable {
    void printCMYK(String doc);
}

class Prn909Drv implements ColorPrintable {
    @Override
    public void printCMYK(String doc) {
        System.out.println("From MD-909 CMYK ver");
        System.out.println(doc);
    }

    @Override
    public void print(String doc) {
        System.out.println("From MD-909 black & white ver");
        System.out.println(doc);
    }
}

//빛의 3원소 (RGB) - Red, Green, Blue
//CMYK : 인쇄를 위한 색상 모드

//이미지표현방식: bitmap방식, vector방식
//이미지포맷: jpg, jpeg, png
