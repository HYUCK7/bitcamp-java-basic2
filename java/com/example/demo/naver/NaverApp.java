package com.example.demo.naver;

/**
 * packageName: com.example.demo.naver
 * fileName   : NaverApp
 * author     : HYUCK7
 * date       : 2022-01-25
 * desc       :
 * variable   : [Class] WEB_LOGO, [Parameter, Instance] ID, PW, [local] String result
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-25         HYUCK7         최초 생성
 */
public class NaverApp {
    public static String WEB_LOGO = "NAVER";
    String ID;
    String PW;

    public String naver(String ID, String PW) {
        this.ID = ID;
        this.PW = PW;

        return String.format("아이디 %s 로그인 성공", this.ID);
    }
}
