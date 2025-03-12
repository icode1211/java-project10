package chap08.zoo;

public class Sample2 {
    private Predator predator;

    public Sample2(Predator predator) {
        this.predator = predator;
    }

    public static void main(String[] args) {
        Zookeeper2 zookeeper = new Zookeeper2();

        Lion2 lion = new Lion2();
        zookeeper.feed(lion);

        Tiger2 tiger = new Tiger2();
        zookeeper.feed(tiger);
    }
}
/* Tiger, Lion, Crocodile, Leopard를 모두 포함하는 Predator 인터페이스 선언 */
interface Predator {
    String getFood();
}
class Zookeeper2 {
    void feed(Predator predator) {
        System.out.println("feed " + predator.getFood());
    }
}
class Tiger2 implements Predator {
    @Override
    public String getFood() {
        return "meat";
    }
}
class Lion2 implements Predator {
    @Override
    public String getFood() {
        return "fish";
    }
}
class Crocodile2 implements Predator {
    @Override
    public String getFood() {
        return "strawberry";
    }
}
