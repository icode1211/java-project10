package chap04.quiz;

/**
 * 사용자에게 입력받은 팩토리얼 계산하기
 * 팩토리얼: N! = N × (N-1) × ... × 1
 */
public class Factorial {
    public static void main(String[] args) {
        int inputValue = Integer.parseInt(args[0]);

        int factorial = 1;
        for (int i = inputValue; i > 0; i--) {
            factorial = factorial * i;
        }
        System.out.println(inputValue + "! = " + factorial);
    }
}
