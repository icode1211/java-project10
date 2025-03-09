package chap05.quiz;

public class CompactWord {
    public static void main(String[] args) {
//        "aaaabbccd" -> "a4b2c2d1"
        String word = "aaaabbccd";
        int count = 1;
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i < word.length(); i++) {
            // 이전 char와 비교해서 동일하면 카운팅, 다르면 카운팅 다시
            char currentChar = word.charAt(i);
            char prevChar = word.charAt(i-1);
            if (currentChar == prevChar) {
                count++;
            } else {
                builder.append(prevChar);
                builder.append(count);
                count = 1;
            }
        }
        builder.append(word.charAt(word.length()-1));
        builder.append(count);

        System.out.println(builder);
    }
}
