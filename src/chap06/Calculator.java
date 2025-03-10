package chap06;

/**
 * 매개변수의 효력 범위
 */
public class Calculator {
    static final double PI = 3.14;
    int result;

//    void postfixOperator(int a) {
//        a++;
//    }

    void postfixOperator(Calculator cal) {
        cal.result++;
    }

    public static void main(String[] args) {
        Calculator sample = new Calculator();
//        int a = 1;
//        int result = sample.postfixOperator(a);
//        System.out.println(result);
        sample.result = 1;
        sample.postfixOperator(sample);
//        sample.postfixOperator();
        System.out.println(sample.result);

        System.out.println(PI);
    }
}
