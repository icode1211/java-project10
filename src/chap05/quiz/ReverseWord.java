package chap05.quiz;

public class ReverseWord {
    public static void main(String[] args) {
        String word = "Hello Welcome Java";

        // 단어 뒤집어서 Java Welcome Hello 출력하기
        String[] array = word.split(" ");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
