package chap08.polymorphism;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("Bus가 달립니다");
    }
}
