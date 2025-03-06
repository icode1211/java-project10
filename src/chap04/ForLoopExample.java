package chap04;

public class ForLoopExample {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argument " + (i + 1) + ": " + args[i]);
        }

        // 문자열 배열 선언, for
        String[] array = {"one", "two", "three", "four"};
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(array[i]);
//        }

//         for each문으로 변경해보기!
        for (String str : array) {
            System.out.println(str);
        }
    }
}
