package chap04.quiz;

/**
 * 사용자로부터 정수를 입력받고
 * 그 숫자를 뒤집어서 출력하는 프로그램을 작성
 * input: 12345
 * output: 54321
 */
public class ReversNumber {
    public static void main(String[] args) {
        String str = args[0];
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
    }
}
