package com.example.demo.hello;

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
