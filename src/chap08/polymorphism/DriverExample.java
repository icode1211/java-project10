package chap08.polymorphism;

/**
 * 인터페이스의 다형성
 */
public class DriverExample {
    public static void main(String[] args) {
//        Vehicle bus = new Bus();
//        Vehicle taxi = new Taxi();
//
//        bus.run();
//        taxi.run();

        Vehicle bus = new Bus();
        Vehicle taxi = new Taxi();

        Driver driver = new Driver();
        driver.drive(bus);
        driver.drive(taxi);
    }
}
