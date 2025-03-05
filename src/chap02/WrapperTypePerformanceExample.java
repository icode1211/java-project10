package chap02;

/**
 * 래퍼 타입(Wrapper type)으로 100만 번 덧셈 연산 했을 때 성능 비교
 */
public class WrapperTypePerformanceExample {
    public static void main(String[] args) {
        long startMs = System.currentTimeMillis();
        Integer sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum = sum + i;          // 오토박싱
        }
        long term = System.currentTimeMillis() - startMs;
        System.out.println(term + "ms");
    }
}
