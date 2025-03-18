package chap12;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 자바API에서 제공하는 함수형 인터페이스 타입으로 람다식 실습
 */
public class FunctionalLambdaExample {
    public static void main(String[] args) {
        // Supplier<T>
        Supplier<String> supplier = () -> "리턴값만있음";
        System.out.println("supplier실습 결과: " + supplier.get());

        // Consumer<T>
        Consumer<Integer> consumer = x -> System.out.println("consumer매개값: " + x);
        consumer.accept(1234);

        // Function<T, R>
        Function<Integer, String> function = String::valueOf;
        String returnValue = function.apply(23);
        System.out.println("Function 타입 정의, 결과: " + returnValue);

        Function<String, Integer> function2 = x -> Integer.parseInt(x) + 50;
        int returnValue2 = function2.apply("567");
        System.out.println("Integer.valueOf(x) + 50 결과: " + returnValue2);

        // Predicate<T>
        Predicate<Integer> predicate = x -> x % 2 == 1;
        if (predicate.test(1)) {
            System.out.println("1은 홀수입니다.");
        }
        Predicate<String> emptyStr = x -> x.length() == 0;
        System.out.print(emptyStr.test("문자열"));

    }
}
