package chap13;

import java.util.*;

public class OptionalExample {
    public static void main(String[] args) {
        /* Optional 객체 생성 방법 3가지 */
        Optional<String> empty = Optional.empty();

        String str = null;
        Optional<String> optional1 = Optional.ofNullable(str);

        String str2 = "";
        Optional<String> options2 = Optional.of(str2);

        /* NullPointerExcpeion을 방지하는 Optional 사용하기 */
        List<String> list = null;
//        list.stream()
//                .forEach(System.out::println);
        Optional.ofNullable(list)
                .orElse(new ArrayList<>())
                .forEach(System.out::println);
    }
}
