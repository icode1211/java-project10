package chap04;

/**
 * 나무 10번 찍어 넘기기
 */
public class WhileLoopTreeHitExample {
    public static void main(String[] args) {
        int treeHit = 0;
        while (true) {
            treeHit++;  // treeHit += 1 로도 표현 가능
            System.out.println("나무를  " + treeHit + "번 찍었습니다.");
            if (treeHit == 10) {
                System.out.println("나무 넘어갑니다.");
                break;
            }
        }
    }
}
