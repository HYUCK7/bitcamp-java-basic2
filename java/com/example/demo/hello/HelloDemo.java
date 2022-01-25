package com.example.demo.hello;

import java.util.Scanner;

public class HelloDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HelloApp helloApp = new HelloApp();
        System.out.println(HelloApp.HELLO_APP);
        System.out.println("이름은?");
        System.out.println("나이는?");

        String name = scanner.next();
        int age = scanner.nextInt();

        String result = helloApp.hello(name, age);
        System.out.println(result);
    }
}
