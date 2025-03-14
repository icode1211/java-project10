package chap10;

import chap09.Account;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {
    public static void main(String[] args) {
        /* 제네릭을 사용하지 않고 list 객체 생성 */
        List list = new ArrayList();
        list.add("문자열1");
        list.add(new Account(10000));
        String str = (String) list.get(0);         // 강제 타입 변환 - 불필요한 캐스팅
        System.out.println(str);
        String account = (String) list.get(1);  // 타입 안정성 없음 - 런타임 오류: ClassCastException

        /* 제네릭을 사용해서 list 객체를 생성 */
        List<String> list2 = new ArrayList<>();
        list2.add("문자열");
//        list2.add(new Account(10000));   // 컴파일 오류! 다른 타입이 들어가는것 막아줌(=타입 안정성)
        String str2 = list2.get(0);         // 불필요한 강제 캐스팅(=강제타입변환) 없어도 되는 장점
        System.out.println(str2);
    }
}
