package chap09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileNotFoundExceptionSample {
    public static void main(String[] args) {
        // File이 없는 예외 상황을 처리해야함
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("hi.txt"));
            System.out.println(reader.readLine());

            throw new IOException("IOException");
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾지 못했습니다.");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("파일 읽기에 실패했습니다.");
            System.out.println(e.getMessage());
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
