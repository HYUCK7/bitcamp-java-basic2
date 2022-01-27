package com.example.demo.google;

/**
 * packageName: com.example.demo.google
 * fileName   : GoogleApp.java
 * author     : HYUCK7
 * date       : 2022-01-25
 * desc       : 구글 검색창 따라하기
 * Variable   :[Class] : WEB_LOGO, [Instance] : private String url, [parameter] : String Url,
 *             [local] : String res
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-25         HYUCK7         최초 생성
 */
public class GoogleApp {
    public static String WEB_LOGO = "        Google          ";
    private String url;

    public String google(String url) {
        this.url = url;
        return String.format("검색 결과 : %s",this.url);
    }
}
