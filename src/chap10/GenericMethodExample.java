package chap10;

import chap09.Account;

public class GenericMethodExample {
    public static void main(String[] args) {
        Box<String> result = Util.boxing("문자하나");
        System.out.println(result.get());

        Box<Account> result2 = Util.boxing(new Account(1000000));
    }
}
