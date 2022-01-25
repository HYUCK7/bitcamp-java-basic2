package com.example.demo.login;
/**
 * packageName: com.example.login
 * fileName   : LoginApp.java
 * author     : HYUCK7
 * date       : 2022-01-24
 * desc       : 아이디와 비밀번호, 이름을 입력하면 로그인 하는 앱
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-24       HYUCK7        최초 생성
 */
public class LoginApp {
        private String ID;
        private String PW;
        private String name;
        static String LOGIN_APP = "     <<<LOGIN APP>>>        ";

                public String login(String ID, String PW, String name) {
                        this. ID = ID;
                        this. PW = PW;
                        this. name = name;

                        return String.format("Hello, ID: %s, PW: %s, name: %s" ,
                        this.ID, this.PW, this.name);
                }
}
