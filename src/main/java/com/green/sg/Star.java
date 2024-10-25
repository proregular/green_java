package com.green.sg;

public class Star {
    public static void main(String[] args) {
        star(5);
    }

    public static void star(int n) {
        if(n < 0 && n > 100) {
            return;
        }

        int mIdx = (2*n) -1;
        int sIdx = (mIdx/2);
        int eIdx = sIdx;
        int pmNum = 1;

        for(int i = 0; i<=mIdx; i++) {
            for(int j=0; j<mIdx; j++) {
                if(j > sIdx && j < eIdx) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            if(eIdx == mIdx) {
                pmNum *= -1;
            }

            sIdx += -pmNum;
            eIdx += pmNum;
            System.out.println();
        }
    }
}
