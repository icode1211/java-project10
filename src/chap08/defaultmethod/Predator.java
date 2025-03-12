package chap08.defaultmethod;

interface Predator {
    static final double NUMBER = 3;

    String getFood();

    // 디폴트 메소드
    default void printFood() {
        System.out.println("feed " + getFood());
    }
}
