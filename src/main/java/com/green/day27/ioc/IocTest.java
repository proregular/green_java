package com.green.day27.ioc;

import com.green.day27.MartenWoofer;
import com.green.day27.Speaker;
import com.green.day27.Tv;
import com.green.day27.Woofer;

public class IocTest {
    public static void main(String[] args) {
        Woofer woofer = new MartenWoofer();
        Speaker speaker = new GenelecSpeaker(woofer);
        LgTv lgTv = new LgTv(speaker);
        lgTv.sound();
    }
}

class IocTest3 {
    public static void main(String[] args) {
        TvFactory  tvFactory = TvFactory.getInstance();
        Tv tv = tvFactory.factory(args[0], args[1], args[2]);
        tv.sound();
    }
}
