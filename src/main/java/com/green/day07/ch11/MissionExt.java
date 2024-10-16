package com.green.day07.ch11;

public class MissionExt {
    public static void main(String[] args) {
        //리터럴 사용 금지
        //fileNm에서 jpg문자열을 뽑아내주세요.
        String fileNm = "nice_V.ery.Nice.jpg";

        String ext = fileNm.substring(fileNm.lastIndexOf(".") + 1);
        String ext2 = fileNm.substring(fileNm.lastIndexOf(".")).replace(".", "");

        System.out.println(ext);
        System.out.println(ext2);
    }
}
