package chap10;

import chap09.Account;

import java.util.Arrays;

/**
 * Arrays.toString()
 * Object 클래스의 toString() 메소드
 */
public class ToStringExample {
    public static void main(String[] args) {
        /* 정확한 결과 / 대략적인 결과 */
        // Quiz1.
        int[] num = {4, 5, 6, 7, 8, 0};
        System.out.println(Arrays.toString(num));

        //Quiz2.
        Account[] accounts = {new Account(40000), new Account(3000)};
        System.out.println(Arrays.toString(accounts));

        //Quiz3. : account의 balance  ex) [40000, 3000] 형태로 출력하고싶음. 어떤 코드를 어떻게 바꿔야할지?
        System.out.println(Arrays.toString(accounts));
    }
}
