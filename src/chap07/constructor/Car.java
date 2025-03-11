package chap07.constructor;

public class Car {
    String name;

    Car(String name) {
        this.name = name;
    }

    void powerOn() {
        System.out.println("power on");
    }
}
