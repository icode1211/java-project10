package chap08.basic;

public class CreditCard implements Payment {
    private String cardNum;

    public CreditCard(String cardNum) {
        this.cardNum = cardNum;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("process payment $" + amount);
        // 카드 결제 프로세스
    }
}
