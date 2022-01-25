package com.example.demo.hello;
/**
 * packageName: com.example.hello
 * fileName   : HelloApp.java
 * author     : HYUCK7
 * date       : 2022-01-24
 * desc       : 이름과 나이를 입력하면, 인사말을 리턴하는 앱
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-24         HYUCK7        최초 생성
 */
public class HelloApp {
    String name;
    int age;
    static String HELLO_APP = "헬로우 앱";

    public String hello(String name, int age) {
        this.name = name;
        this.age = age;

        return String.format("내 이름은 %s, 나이는 %s살이야." ,this.name, this.age);
    }
}
