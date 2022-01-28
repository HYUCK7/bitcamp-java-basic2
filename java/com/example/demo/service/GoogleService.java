package com.example.demo.service;

import com.example.demo.domain.GoogleDTO;

/**
 * packageName: com.example.demo.google
 * fileName   : GoogleDemo.java
 * author     : HYUCK7
 * date       : 2022-01-25
 * desc       : 구글 검색창을 실행하는 컨트롤러
 * * Variable   :[Class] : WEB_LOGO [Instance] : this.url [parameter] : (String Url)
 *               [local] : String res
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-25         HYUCK7         최초 생성
 */
public class GoogleService {
    public String getUrl(GoogleDTO google) {


        return String.format("검색 결과 : %s", google.getUrl());
    }
}
