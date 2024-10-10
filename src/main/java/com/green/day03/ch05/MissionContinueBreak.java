package com.green.day03.ch05;

public class MissionContinueBreak {
    public static void main(String[] args) {
        /*
            자연수 1부터 시작해서 모든 홀수를 더해 나간다.
            그리고 그 합이 언제(몇을 더했을 때) 1,000을
            넘어서는지, 그리고 1,000을 넘어선 값을 얼마가
            되는지 계산하여 출력하는 프로그램을 작성해보자.
         */
        int n = 1;
        int sum = 0;

        while(true) {
            if((n % 2) != 0) {
                sum += n;

                if(sum >= 1000) {
                    System.out.println("더한 수: " + n);
                    System.out.println("1,000을 넘어선 값: " + sum);

                    break;
                }
            }
            n++;
        }

        System.out.println("----------------------------------------");

        n = 1;
        sum = 0;

        while(sum < 1000) {
            if((n % 2) != 0) {
                sum += n;
            }

            n++;
        }

        System.out.println("더한 수: " + (n - 1));
        System.out.println("1,000을 넘어선 값: " + sum);
    }
}
