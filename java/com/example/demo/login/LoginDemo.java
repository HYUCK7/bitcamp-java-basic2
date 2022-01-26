package com.example.demo.login;
/**
 * packageName: com.example.login
 * fileName   : LoginDemo.java
 * author     : HYUCK7
 * date       : 2022-01-24
 * desc       : LoginApp을 실행시키는 컨트롤러
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-24         HYUCK7        최초 생성
 * 2022-01-26         HYUCK7        if절 추가
 */
import java.util.Scanner;

public class LoginDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginApp loginApp = new LoginApp();

        System.out.println(LoginApp.LOGIN_APP);

        System.out.println("아이디: ");
        String ID = scanner.next();

        System.out.println("패스워드: ");
        String PW = scanner.next();

        System.out.println("이름: ");
        String name = scanner.next();

        String result = loginApp.login(ID,PW,name);
        System.out.println(result);
    }
}
