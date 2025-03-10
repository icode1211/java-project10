package chap06;

/**
 * 생성자 오버로딩
 * 생성자 오버로딩 후 객체 생성해보기
 * 메소드 정의 (리턴타입 있는 메소드, 리턴타입 없는 메소드)
 * 메소드 정의 후 메소드 호출해보기
 */
public class Car {
    private String name;
    private String model;
    private int maxSpeed;

    // 생성자
    Car() {
        this.name = "초기화값";
    }

    // 매개변수가 있는 생성자
    Car(String name) {
        this.name = name;
        this.maxSpeed = 200;    // 기본적인 maxSpeed로 초기화 가능
    }

    Car(String name, String model) {
        this.name = name;
        this.model = model;
        this.maxSpeed = 200;
    }

    Car(String name, String model, int maxSpeed) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    // 리턴 타입이 없는 메소드
    void engineStart() {
        System.out.println("Engine Start!");
        returnMaxSpeed(10);
    }

    // 리턴 타입 있는 메소드
    int returnMaxSpeed(int speed) {
        System.out.println("현재 스피드: " + speed);
        return maxSpeed;
    }

    public static void main(String[] args) {
        // Car 클래스 객체 생성
        Car ferrari = new Car("ferrari");
        System.out.println(ferrari.name);

        Car sonata = new Car("sonata");
        System.out.println(sonata.name);

        Car avante = new Car("avante");
        System.out.println(avante.name);

        Car car = new Car();
        Car sportage = new Car("kia", "sportage");
        Car bmw = new Car("bmw", "520d", 300);
        System.out.println("bmw.model: " + bmw.model);
        System.out.println("bmw.name: " + bmw.name);
        System.out.println("bmw.maxSpeed: " + bmw.maxSpeed);

        // 메소드 호출해보기
        bmw.engineStart();
        bmw.returnMaxSpeed(10);

//1.X        void value = bmw.engineStart();
//2.O        int value2 = bmw.returnMaxSpeed(10);
        int value2 = bmw.returnMaxSpeed(10);
        System.out.println("value2: " + value2);

        bmw.engineStart();
        bmw.returnMaxSpeed(300);
    }
}
