package com.example.demo.service;
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
import com.example.demo.domain.HelloDTO;

public class HelloService {
    public String execute(HelloDTO hello) {

        return String.format("내 이름은 %s, 나이는 %d살이야." ,
                hello.getName(), hello.getAge());
    }
}
