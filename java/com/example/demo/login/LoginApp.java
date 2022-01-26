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
 * 2022-01-26       HYUCK7        if절 추가
 */
public class LoginApp {
        private String ID;
        private String PW ;
        private String name;
        static String PASSWORD = "abc";
        static String LOGIN_APP = "     <<<LOGIN APP>>>        ";

                public String login(String ID, String PW, String name) {
                        this. ID = ID;
                        this. PW = PW;
                        this. name = name;
                        String res = "";
                        /**
                        if(PW.equals("abc")) {
                                res = String.format(" %s 님의 비밀번호 %s가 맞습니다. 로그인 성공 ", this.name, this.PW);
                        }else res = String.format(" %s 님의 ID는 맞으나, PW %s 가 틀립니다. 로그인 실패 ", this.ID, this.PW);
                         /**
                        switch(PW){
                                case("abc"): res = String.format(" %s 님의 비밀번호 %s가 맞습니다. 로그인 성공 ", this.name, this.PW); break;
                                default: res = String.format(" %s 님의 ID는 맞으나, PW %s 가 틀립니다. 로그인 실패 ", this.ID, this.PW);
                        }*/
                        return res = (PW.equals(PASSWORD)) ? String.format(" %s 님의 비밀번호 %s가 맞습니다. 로그인 성공 ", this.name, this.PW)
                                : String.format(" %s 님의 ID는 맞으나, PW %s 가 틀립니다. 로그인 실패 ", this.ID, this.PW);

                }
}
