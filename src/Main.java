public class Main {
    // 변수 선언/초기화

    // 생성자

    public static void main(String[] args) {
        System.out.println("Hello world!");
//        staticReturnSample();
    }

    // 정적 메소드 - Main.staticReturnSample() 호출 가능
    static int staticReturnSample() {
        return 1;
    }

    /*
        Main 클래스의 객체 생성 후 메소드 호출 가능
        Main main = new Main();
        main.returnSample();
     */
    int returnSample() {
        return 1;
    }
}