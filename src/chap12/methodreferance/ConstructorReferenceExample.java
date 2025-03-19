package chap12.methodreferance;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * 생성자 참조
 */
public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Function<String, Member> function;
        function = str -> new Member(str);
        function = Member::new;     // 생성자 참조

        Member member = function.apply("id1");
        System.out.println("member.id: " + member.getId());
        System.out.println("member.name: " + member.getName());

        BiFunction<String, String, Member> biFunction;
        biFunction = (str1, str2) -> new Member(str1, str2);
        biFunction = Member::new;   // 생성자 참조

        Member member2 = biFunction.apply("id2", "name2");
        System.out.println("member2.id: " + member2.getId());
        System.out.println("member2.name: " + member2.getName());
    }
}
