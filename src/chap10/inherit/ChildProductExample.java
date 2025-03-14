package chap10.inherit;

public class ChildProductExample {
    public static void main(String[] args) {
        Tv tv = new Tv();
        ChildProduct<Tv, String, String> childProduct
                = new ChildProduct<>(tv, "smartTV", "LG");
        System.out.println("kind: " + tv);  // Tv@~~~
        System.out.println("model: " + childProduct.getModel());
        System.out.println("company: " + childProduct.getCompany());
    }
}
