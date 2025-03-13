package chap09;

public class ArrayExceptionSample {
    public static void main(String[] args) {
        try {
            int index = Integer.parseInt(args[0]);
            int[] num = {1, 2, 3, 4, 5};
            System.out.println(num[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // 실행문
            System.out.println(e.getMessage());  // Throwable 클래스의 getMessage() 메소드 호출
            System.out.println("에러발생!!");
        }
    }
}
