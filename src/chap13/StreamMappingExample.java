package chap13;

import java.util.Arrays;
import java.util.List;

/**
 * map, flatmap 실습
 */
public class StreamMappingExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e");

        List<String> newList = list.stream()
                .map(String::toUpperCase)
                .toList();          // .collect(Collectors.toList());
        System.out.print(newList + "\n");

        List<String> list2 = Arrays.asList("Hello World", "Java stream");

        List<String> newList2 = list2.stream()
                .flatMap(input -> Arrays.stream(input.split(" "))) // Stream<String>
                .toList();
        System.out.println(newList2);
    }
}
