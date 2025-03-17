package chap11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // 1. list 생성 및 객체 추가
        List<String> list = new ArrayList<>();
//        List<String> list = new LinkedList<>();   // 구현 클래스만 바꿔줘도 됨
        list.add("Java");
        list.add("Spring");
        list.add("Servlet/JSP");
        list.add("DBMS");
        list.add("JPA");
        list.add("Java");

        // 2. 검색 (index검색, list 총 개수)
        System.out.println("list 크기: " + list.size());
        System.out.println("list.get(2): " + list.get(2));

        // 3. 삭제
        list.remove("Servlet/JSP");

        // 4. list 전체 탐색
//        for (String str : list) {
//            System.out.println("\t" + str);
//        }
        for (int index = 0; index < list.size(); index++) {
            System.out.println("\t" + index + ": " + list.get(index));
        }

    }
}
