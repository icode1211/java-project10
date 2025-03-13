package chap09;

public class ATM {
    public static void main(String[] args) {
        int inputMoney = 300000;     // 사용자로부터 받은 출금 요청 (30만원)
        Account account = new Account(100000);

        try {
            account.withdraw(inputMoney);
        } catch (BalanceInsufficientException e) {
            System.out.println(e.getMessage());
            // 사용자에게 "잔액부족" 메시지 보여주기
            // 아무런 처리를 하지 않음
        }
    }
}
