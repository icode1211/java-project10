package chap02;

/**
 * 기본 타입(primitive type)으로 100만 번 덧셈 연산 했을 때 성능 비교
 */
public class PrimitiveTypePerformanceExample {
    public static void main(String[] args) {
        long startMs = System.currentTimeMillis();
        int sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum = sum + i;          // primitive type 연산
        }
        long term = System.currentTimeMillis() - startMs;
        System.out.println(term + "ms");
    }
}
