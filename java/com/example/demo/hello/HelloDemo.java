package com.example.demo.hello;
/**
 * packageName: com.example.hello
 * fileName   : HelloDemo.java
 * author     : HYUCK7
 * date       : 2022-01-24
 * desc       : HelloApp을 실행하는 컨트롤러
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-24         HYUCK7        최초 생성
 */
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
