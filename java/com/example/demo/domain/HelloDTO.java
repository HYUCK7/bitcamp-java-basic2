package com.example.demo.domain;
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
public class HelloDTO {
    String name;
    int age;
    public static String HELLO_APP = "헬로우 앱";

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

}
