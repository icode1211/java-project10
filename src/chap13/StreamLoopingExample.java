package chap13;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamLoopingExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        OptionalInt maxValueOpt = list.stream()
                .mapToInt(x -> x)    // Integer::intValue  (Integer -> int)
                .filter(x -> x % 2 == 0)
                .peek(System.out::println)       // [2, 4]
                .max();

        int maxValue = maxValueOpt.orElse(0);
        System.out.println("maxValue: " + maxValue);

        int result = IntStream.rangeClosed(5, 10)     // IntStream
                .peek(System.out::println)
                .sum();
        System.out.print("sum: " + result);

        List<Integer> quizList = Arrays.asList(5, 6, 7, 8,9 , 10);
        quizList.stream()
                .mapToInt(x -> x)   // Stream<Integer> -> IntStream 형변환
                .peek(System.out::println)
                .forEach(System.out::println);
//        System.out.println("sum: " + result2);

    }
}
