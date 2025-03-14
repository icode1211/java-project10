package chap10;

public class GenericTypeExample {
    public static void main(String[] args) {
        Box box = new Box();
        box.set("value");
//        int value = (int) box.get();   // 강제타입변환
        String value = (String) box.get();
        System.out.println("Generic Type 사용하지 않은경우. value: " + value);

        Box<String> box2 = new Box<>();
        box2.set("문자열");
        String str = box2.get();
        System.out.println("Generic Type 사용. value: " + str);
    }
}
