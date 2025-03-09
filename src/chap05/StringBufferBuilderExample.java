package chap05;

public class StringBufferBuilderExample {
    public static void main(String[] args) {
//        Hello Java/Spring DBMS!
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello ");
        buffer.append("Java/Spring ");
        buffer.append("DBMS!");
        System.out.println(buffer);

        buffer.insert(1, "Hello!");
        System.out.println(buffer);

        System.out.println(buffer.substring(10));
        System.out.println(buffer.substring(10, 13));

        StringBuffer reverse = buffer.reverse();
        System.out.println("reverse result: " + reverse);

        StringBuilder builder = new StringBuilder("value");
        builder.append("12345");
    }
}
