package com.example.demo.service;

import com.example.demo.domain.LoginDTO;

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

public class LoginService {
    public String getLogin(LoginDTO login) {
        String res ="";
            return res = (login.getPW().equals(LoginDTO.PASSWORD))?
                    String.format(" %s 님의 비밀번호 %s가 맞습니다. 로그인 성공 "
                            , login.getName(), login.getPW())
                    : String.format(" %s 님의 ID는 맞으나, PW %s 가 틀립니다. 로그인 실패 "
                    , login.getName(),login.getPW());

        }
    }

