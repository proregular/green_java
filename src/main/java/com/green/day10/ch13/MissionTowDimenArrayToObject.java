package com.green.day10.ch13;

public class MissionTowDimenArrayToObject {
    public static void main(String[] args) {
        Student[] arr = new Student[3];

        arr[0] = new Student("영수", 100, 90, 80);
        arr[1] = new Student("상철", 90, 90, 80);
        arr[2] = new Student("광수", 80, 70, 60);

        printStudentInfo(arr);
        printTotalKorScores(arr); // 국어 - 합계점수 ?, 평균점수 ?
        printTotalEngScores(arr);
        printTotalMathScores(arr);
        printTotalSubjectScore(arr); // 학급 - 합계점수?, 평균점수 ?
    }

    public static void printStudentInfo(Student[] students) {
        for(Student stu : students) {
            System.out.println(stu);
        }
    }

    public static void printTotalKorScores(Student[] students) {
        int sum = 0;

        for(Student stu : students) {
            sum += stu.getKorScore();
        }

        float avg = (float)sum / students.length;

        System.out.printf("국어 - 합계점수: %d, 평균점수: %.1f\n", sum, avg);
    }

    public static void printTotalEngScores(Student[] students) {
        int sum = 0;

        for(Student stu : students) {
            sum += stu.getEngScore();
        }

        float avg = (float)sum / students.length;

        System.out.printf("영어 - 합계점수: %d, 평균점수: %.1f\n", sum, avg);
    }

    public static void printTotalMathScores(Student[] students) {
        int sum = 0;

        for(Student stu : students) {
            sum += stu.getMathScore();
        }

        float avg = (float)sum / students.length;

        System.out.printf("수학 - 합계점수: %d, 평균점수: %.1f\n", sum, avg);
    }

    public static void printTotalSubjectScore(Student[] students) {
        int sum = 0;

        for(Student stu : students) {
            sum += stu.getAllScore();
        }

        float avg = (float)sum / (students.length * Student.SUBJECT_CNT);

        System.out.printf("학급 - 합계점수: %d, 평균점수: %.1f\n", sum, avg);
    }
}

class Student {
    public static final int SUBJECT_CNT = 3;
    private String name;
    private int korScore; //국어 점수
    private int engScore; //영어 점수
    private int mathScore; //수학 점수

    Student(String name, int korScore, int engScore, int mathScore) {
        this.name = name;
        this.korScore = korScore;
        this.engScore = engScore;
        this.mathScore = mathScore;
    }

    public String getName() {
        return name;
    }

    public int getKorScore() {
        return korScore;
    }

    public int getEngScore() {
        return engScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getAllScore() {
        return korScore + engScore + mathScore;
    }

    @Override
    public String toString() {
        int totalScore = getAllScore();
        return String.format("%s: 국어: %d, 영어: %d, 수학: %d | 합계점수: %d, 평균점수: %.1f"
                , name, korScore, engScore, mathScore, totalScore, (float)totalScore / SUBJECT_CNT);
    }
}

