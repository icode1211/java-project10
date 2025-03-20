package chap13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class OptionalExample2 {
    public static void main(String[] args) {
        String str = null;
        Optional<String> optional = Optional.ofNullable(str);

        if (optional.isPresent()) {
            System.out.println(optional.get());
        }

        String strDefault = optional.orElse("문자열");
        System.out.print("default value: " + strDefault);

        Optional<List<String>> optional2 = Optional.ofNullable(null);
        optional2.orElseGet(LinkedList::new)
                .forEach(System.out::println);

        optional2.orElseThrow(RuntimeException::new);

    }
}
