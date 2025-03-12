package chap08.defaultmethod;

public class Zoo {
    private Predator predator;

    public Zoo(Predator predator) {
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

class Zookeeper2 {
    void feed(Predator predator) {
        predator.printFood();       // 디폴트 메소드로 변경
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
