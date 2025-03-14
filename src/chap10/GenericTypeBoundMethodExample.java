package chap10;

import java.util.ArrayList;
import java.util.List;

public class GenericTypeBoundMethodExample {
    public static void main(String[] args) {
        int result = Util.compare(4, 5);        // int -> Integer (오토박싱)
        System.out.println("result: " + result);

        int result2 = Util.compare(3.5, 3.5);   // double -> Double (오토박싱)
        System.out.println("result2: " + result2);

        List<Integer> list = new ArrayList<>();
        list.add(10);       // int -> Integer (오토박싱)
        list.add(20);       // int -> Integer
        list.add(30);
    }
}
