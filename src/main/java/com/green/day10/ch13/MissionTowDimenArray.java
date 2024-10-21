package com.green.day10.ch13;

import java.util.Arrays;

public class MissionTowDimenArray {
    public static void main(String[] args) {
        int[][] score = {
                // 국어, 영어, 수학, 사회
                {100, 90, 80, 10}, // 영수
                {90, 90, 80, 20}, // 상철
                {80, 70, 60, 30}, // 광수
                {90, 75, 66, 40}, // 민우
        };
        /*
        영수: 합계점수, 평균점수
        상철: 합계점수, 평균점수
        광수: 합계점수, 평균점수
        국어: 합계점수, 평균점수
        영어: 합계점수, 평균점수
        수학: 합계점수, 평균점수
        학급: 합계점수, 평균점수
         */
        // 학생들 합계, 평균
        int students[] = new int[score.length];
        int gwamoks[] = new int[score[0].length];
        int hakup = 0;

        for (int i = 0; i < score.length; i++) {
            for (int z = 0; z < score[i].length; z++) {
                students[i] += score[i][z];
                gwamoks[z] += score[i][z];
            }
        }

        for(int i=0; i<gwamoks.length; i++) {
            hakup += gwamoks[i];
        }

        for(int i=0; i<score.length; i++) {
            String name = "영수";
            switch(i) {
                case 1:
                    name = "상철";
                    break;
                case 2:
                    name = "광수";
                    break;
            }

            System.out.printf("%s: 합계점수: %d, 평균점수: %.1f\n", name, students[i], (float)students[i] / score.length);
        }

        System.out.println("---------------------------------");
        for(int i=0; i<score[0].length; i++) {
            String name = "국어";
            switch(i) {
                case 1:
                    name = "수학";
                    break;
                case 2:
                    name = "영어";
                    break;
            }

            System.out.printf("%s: 합계점수: %d, 평균점수: %.1f\n", name, gwamoks[i], (float)gwamoks[i] / score[i].length);
        }

        System.out.println("=================================");
        System.out.printf("학급 합계점수: %d, 평균점수: %.1f\n", hakup, (float)hakup / score.length / score[0].length);
    }
}
