package chap06;

/**
 * final로 선언한 필드 (값 수정 불가한 특징)
 */
public class KoreaPeople {
    final String nation;
    String name;

    KoreaPeople(String name) {
        this.name = name;

        // final 필드 초기화!
        nation = "Java World";
    }

    public static void main(String[] args) {
        KoreaPeople people = new KoreaPeople("이름");
        System.out.println(people.name);
        System.out.println(people.nation);
    }
}
