package chap04.quiz;

import java.util.Scanner;

/**
 * 스캐너 Sample.
 * Scanner 사용하여 사용자에게 입력받은 값 출력하기
 */
public class ScannerSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.nextLine();

        // inputValue 활용 = 사용자로부터 입력받은 값 활용 가능
        System.out.println(inputValue);
    }
}
