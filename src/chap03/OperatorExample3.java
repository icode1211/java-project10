package chap03;

/**
 * 삼항 연산자
 * quiz) score가 85점일 경우 학점은?
 */
public class OperatorExample3 {
    public static void main(String[] args) {
        int score = Integer.parseInt(args[0]);
        char grade = (score > 90) ? 'A' : ((score > 85) ? 'B' : 'C');

        System.out.println("당신의 학점은 : " + grade);
    }
}
