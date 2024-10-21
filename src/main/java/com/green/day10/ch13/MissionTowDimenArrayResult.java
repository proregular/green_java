package com.green.day10.ch13;

public class MissionTowDimenArrayResult {
    public static void main(String[] args) {
        int[][] score = {
                // 국어, 영어, 수학, 사회
                {100, 90, 80}, // 영수
                {90, 90, 80}, // 상철
                {80, 70, 60}, // 광수
        };
        String[] names = { "영수", "상철", "광수"};
        int[] nameScore = new int[names.length];

        String[] subjects = { "국어", "영어", "수학"};
        int[] subjectScore = new int[subjects.length];

        // 각 이름별, 과목별 합계값 구하는 부분
        for(int i=0; i<score.length; i++) {
            for(int i2=0; i2<score[i].length; i2++) {
                nameScore[i] += score[i][i2];
                subjectScore[i2] += score[i][i2];
            }
        }

        int totalScore = 0;

        //학생 별 합계점수, 평균점수 출력하는 부분
        for(int i=0; i<names.length; i++) {
            totalScore += nameScore[i];
            System.out.printf("%s: 합계점수: %d, 평균점수: %.1f\n", names[i], nameScore[i], (float)nameScore[i] / subjects.length);
        }
        System.out.println("-------------------------------------------");
        //과목 별 합계점수, 평균점수
        for(int i=0; i<subjects.length; i++) {
            System.out.printf("%s: 합계점수: %d, 평균점수: %.1f\n", subjects[i], subjectScore[i], (float)subjectScore[i] / names.length);
        }
        System.out.println("===========================================");
        System.out.printf("학급: 합계점수: %d, 평균점수: %.1f\n", totalScore, (float)totalScore / (names.length * subjects.length));
    }
}
