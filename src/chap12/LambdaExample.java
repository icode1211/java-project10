package chap12;

/**
 * Runnable 함수형 인터페이스 타입으로 람다식 실습
 */
public class LambdaExample {
    public static void main(String[] args) {
        // Runnable의 익명 구현 객체 선언
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 구현 메소드 runnable1.run() 출력문");
            }
        };
        runnable1.run();

        System.out.println("=================");

        Runnable runnable = () -> System.out.println("람다식으로 정의한 익명 구현 메소드 runnable.run() 출력문");
        runnable.run();
    }
}
