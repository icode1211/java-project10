package chap02;

/**
 * byte 자료형 변수에 127 이상의 숫자를 넣으면 ?
 */
public class GarbageValueExample {
    public static void main(String[] args) {
        byte var1 = 125;
        int var2 = 125;    // 126, 127, 128, 129, 130

        for (int i = 0; i < 5; i++) {
            var1++;
            var2++;
            System.out.println("var1: " + var1 + "\t" + "var2: " + var2);
        }
    }
}
