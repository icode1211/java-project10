package chap04.quiz;

import java.io.IOException;
import java.util.Scanner;

public class ReversNumber2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수를 입력하세요: ");
        int num = scanner.nextInt();
        int reverseNum = 0;
        while (num != 0) {
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }
        System.out.println(reverseNum);
        scanner.close();
    }
}
