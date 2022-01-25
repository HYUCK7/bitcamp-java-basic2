package com.example.demo.login;

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
