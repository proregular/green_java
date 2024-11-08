package com.green.day27;

import com.green.day27.noneioc.HarmanSpeaker;
import com.green.day27.noneioc.JBLSpeaker;
import com.green.day27.noneioc.SamsungTv;

public class Test {
    public static void main(String[] args) {
        HarmanSpeaker harmanSpeaker = new HarmanSpeaker();
        harmanSpeaker.speakerSound();

        System.out.println("----------------------------------------");

        SamsungTv samsungTv = new SamsungTv();
        samsungTv.sound();

        System.out.println("----------------------------------------");

        JBLSpeaker jblSpeaker = new JBLSpeaker();
        jblSpeaker.speakerSound();

    }
}
