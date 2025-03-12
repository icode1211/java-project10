package chap08.zoo;

public class Sample {
    public static void main(String[] args) {
        Zookeeper zookeeper = new Zookeeper();

        Lion lion = new Lion();
        zookeeper.feed(lion);

        Tiger tiger = new Tiger();
        zookeeper.feed(tiger);
    }
}
class Zookeeper {
    void feed(Tiger tiger) {
        System.out.println("feed meat");
    }
    void feed(Lion lion) {
        System.out.println("feed fish");
    }
    void feed(Crocodile crocodile) {
        System.out.println("feed strawberry");
    }
    void feed(Leopard leopard) {
        System.out.println("feed orange");
    }
}
class Tiger {

}
class Lion {

}
class Crocodile {

}
class Leopard {

}



