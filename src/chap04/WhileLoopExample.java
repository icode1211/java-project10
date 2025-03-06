package chap04;

public class WhileLoopExample {
    public static void main(String[] args) {
        // while 1~30 출력
//        int number = 1;
//        while (number <= 30) {
//            System.out.println(number);
//            number++;
//        }

        // do-while문으로 1~30 출력
        int number2 = 0;
        do {
            System.out.println(++number2);
        } while (number2 < 30);
    }
}
