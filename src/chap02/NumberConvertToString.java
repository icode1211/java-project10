package chap02;

/**
 * 2.5 숫자 -> 문자열 형변환
 */
public class NumberConvertToString {
    public static void main(String[] args) {
        Long num = null;

//        String convert1 = Long.toString(num); // NullPointerException 발생 가능성 있음
        String convert2 = String.valueOf(num); // null safe
        String convert3 = num + "";

//        System.out.println(convert1);
        System.out.println(convert2);
        System.out.println(convert3);
    }
}
