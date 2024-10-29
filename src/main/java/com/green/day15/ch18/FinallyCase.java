package com.green.day15.ch18;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FinallyCase {
    public static void main(String[] args)  {
        //만약 BufferedWriter writer = Files.newBufferedWriter(path); 이때는 문제가 없었고
        //writer.write("FinallyCase"); 이때 예외가 발생이 되었다면
        //writer.close(); 이 문장이 실행이 되지 않는다.
        //그런데 writer.close(); 이문장이 실행 되어야만 한다면
        try {
            Path path = Paths.get("D:/Simple.txt"); //절대경로 (full 경로)
            BufferedWriter writer = Files.newBufferedWriter(path);
            writer.write("FinallyCase");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class FinallyCase2 {
    public static void main(String[] args) {
        //만약 BufferedWriter writer = Files.newBufferedWriter(path); 이때는 문제가 없었고
        //writer.write("FinallyCase"); 이때 예외가 발생이 되었다면
        //writer.close(); 이 문장이 실행이 되지 않는다.
        //그런데 writer.close(); 이문장이 실행 되어야만 한다면
        BufferedWriter writer = null;
        try {
            Path path = Paths.get("D:/Simple.txt"); //절대경로 (full 경로)
            writer = Files.newBufferedWriter(path);
            writer.write("FinallyCase");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            writer.close();
        } catch (IOException e) {

        }

    }
}

class FinallyCase3 {
    public static void main(String[] args) {
        BufferedWriter writer = null;

        try {
            Path path = Paths.get("D:/Simple.txt"); //절대경로 (full 경로)
            writer = Files.newBufferedWriter(path);
            writer.write("FinallyCase");
            return;
        } catch (IOException e) {
            e.printStackTrace();
        } finally { // 예외가 발생해도 안대호
            System.out.println("실행이 되나?");
            try {
                writer.close();
            } catch (IOException e) {

            }
        }
    }
}


