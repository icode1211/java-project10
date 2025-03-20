package chap13;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamCollectExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 1, 2, 2, 2, 3, 4, 5, 5, 5);

        Set<Integer> set = list.stream()
                .filter(x -> x % 2 == 0)        // 2,2,2,4
                .collect(Collectors.toSet());
        System.out.println("set 결과: " + set);

        List<Integer> resultList = list.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("List 결과: " + resultList);

        Map<Integer, Long> map = list.stream()
                .collect(Collectors.groupingBy(
                        x -> x,
                        Collectors.counting()
                ));
        System.out.println("map 결과: " + map);
    }
}
