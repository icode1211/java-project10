package chap13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        OptionalDouble avg = list.stream()
                .mapToInt(Integer::intValue)
                .average();

//        if (avg.isPresent()) {
//            System.out.println(avg.getAsDouble());
//        }


//        avg.ifPresent(average -> System.out.println(average));
        avg.ifPresent(System.out::println);
//        avg.ifPresentOrElse(System.out::println, () -> System.out.println("값이 비었습니다"));
    }
}
