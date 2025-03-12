package chap08.basic;

/**
 * 8.1 인터페이스 사용 예시
 */
public class Order {
    public static void main(String[] args) {
        double amount = 100.34;

//        Payment creditCard = new CreditCard("12345-67890");
//        Payment paypal = new Paypal("sample@est.com");
//
//        creditCard.processPayment(amount);
//        paypal.processPayment(amount);

        pay("creditCard", amount);
    }

    static void pay(String paymentMethod, double amount) {
        Payment payment;
        if (paymentMethod.equals("creditCard")) {
            payment = new CreditCard("12345-67890");
        } else if (paymentMethod.equals("naverPay")) {
            payment = new NaverPay();
        } else {
            payment = new Paypal("sample@est.com");
        }

        payment.processPayment(amount);     // 다형성
    }

}
