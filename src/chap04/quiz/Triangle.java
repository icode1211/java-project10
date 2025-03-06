package chap04.quiz;

/**
 * input: 5
 * result:
 * *
 * **
 * ***
 * ****
 * *****
 */
public class Triangle {
    public static void main(String[] args) {
        int height = Integer.parseInt(args[0]);
        for (int i = 1; i <= height; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
