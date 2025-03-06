package chap04.quiz;

/**
 * 사용자로부터 숫자 N을 입력받고
 * N단의 구구단을 출력하는 프로그램을 작성
 */
public class GuguDan {
    public static void main(String[] args) {
        int dan = Integer.parseInt(args[0]);
        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " x " + i + " = " + (dan * i));
        }
    }
}
