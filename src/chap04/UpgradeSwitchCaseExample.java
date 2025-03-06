package chap04;

/**
 * Java17 이후 Switch Case문에서 쓸 수 있는 Pattern matching 예시
 *
 * (checkType 메소드에 있는 '제네릭, T'는 생소할 수 있습니다만,
 * "타입을 당장 명시하진 않지만 어떤 타입이 와도 된다"
 * 라는 의미로 보시면 됩니다.)
 */
public class UpgradeSwitchCaseExample {
    public static void main(String[] args) {
        System.out.println(checkType(args[0]));
    }

    public static <T> String checkType(T input) {
        return switch (input) {
            case Number num -> "숫자 타입 입니다.";
            case Character ch -> "문자(Character) 타입 입니다.";
            case String str -> "문자열(String) 타입 입니다.";
            default -> "invalid type";
        };
    }
}
