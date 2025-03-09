package chap05;

public class StringMethodExample {
    public static void main(String[] args) {
        String a = "Hello World!";

        int indexOf = a.indexOf("8");
        System.out.println(indexOf);    //없으면 -1, 있으면 index

        boolean isContains = a.contains("World!");
        System.out.println(isContains);

//        charAt(index)
        char ch = a.charAt(8);
        System.out.println("ch: " + ch);

        String replaceValue = a.replace("World", "Java");
        System.out.println("replace value: " + replaceValue);

        String str = "Hello 1234 Java";
        String replaceValue2 = str.replaceAll("\\d", "");
        System.out.println(replaceValue2);

        // substring = 인덱스를 이용해서 문자열을 뽑아낼 때 사용
        System.out.println(a.substring(7, 8));
        System.out.println(a.substring(7));

        // 대문자/소문자
        System.out.println("대문자: " + a.toUpperCase() + ", 소문자: " + a.toLowerCase());

        // 문자열 이어붙이기(+)
        System.out.println(a.concat(":이어붙이려는 문자열"));
        System.out.println(a + ":이어붙이려는 문자열");

    }
}
