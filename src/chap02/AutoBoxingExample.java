package chap02;

import java.util.ArrayList;

/**
 * 2.5 오토 박싱 (Primitive -> Wrapper type)
 */
public class AutoBoxingExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // 오토 박싱 (Auto Boxing)
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        /* 언박싱 (참조 자료형->기본 자료형) */
        Integer integerValue1 = Integer.valueOf(10);
        int integerValue2 = integerValue1;

        System.out.println(integerValue2);
    }
}
