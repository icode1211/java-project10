package chap10.quiz;

public class Util {
    public static <T, E> E getValue(Pair<T, E> pair, T key) {
        if (pair.getKey() == key) {
            return pair.getValue();
        }
        return null;
    }
}
