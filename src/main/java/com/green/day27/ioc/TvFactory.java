package com.green.day27.ioc;

import com.green.day27.*;

public class TvFactory {
    //SingleTon 패턴, 싱글톤 패턴
    //객체는 딱 하나만 만들어서 돌려쓴다.
    private static TvFactory tvFactory;
    public static TvFactory getInstance() {
        if(tvFactory == null) {
            tvFactory = new TvFactory();
        }
        return tvFactory;
    }

    private TvFactory() {}

    public Tv factory(String tvName, String speakerName, String wooferName) {
        Woofer woofer = switch (wooferName) {
            case "hanil" -> new HanilWoofer();
            case "merten" -> new MartenWoofer();
            default -> null;
        };

        Speaker speaker = switch (speakerName) {
            case "bose" -> new BoseSpeaker(woofer);
            case "genelec" -> new GenelecSpeaker(woofer);
            default -> null;
        };

        return switch(tvName) {
            case "lg" -> new LgTv(speaker);
            default -> null;
        };
    }
}

class IocTest2 {
    public static void main(String[] args) {
        TvFactory tvFactory = TvFactory.getInstance();
        TvFactory tvFactory2 = TvFactory.getInstance();
        TvFactory tvFactory3 = TvFactory.getInstance();

        System.out.println(tvFactory == tvFactory2);
        System.out.println(tvFactory2 == tvFactory3);
        System.out.println(tvFactory);
        System.out.println(tvFactory2);
        System.out.println(tvFactory3);

    }
}
