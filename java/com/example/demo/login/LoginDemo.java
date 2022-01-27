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
    public String execute(String ID, String PW, String name) {
        LoginApp loginApp = new LoginApp();
        return loginApp.login(ID,PW,name);
    }
}
