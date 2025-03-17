package chap11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("닝닝");
        set.add("카리나");
        set.add("윈터");

        // Iterator 객체
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
            it.remove();
        }
        System.out.print("size: " + set.size());
    }
}
