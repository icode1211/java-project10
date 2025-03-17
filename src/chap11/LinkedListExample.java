package chap11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add("마지막 인덱스 값");
        }
        System.out.println("ArrayList: " + (System.nanoTime() - startTime) + "ns");

        startTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(0, "첫번째에 값 추가");  // 중간 값 변경이 빈번할 경우 LinkedList win
            linkedList.add("마지막 인덱스 값");          // 마지막 인덱스에 계속 값을 추가할경우 Arraylist win
        }
        System.out.println("LinkedList: " + (System.nanoTime() - startTime) + "ns");
    }
}
