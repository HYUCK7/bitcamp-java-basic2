package com.example.demo.auth.service;

import com.example.demo.auth.domain.*;

/**
 * packageName: com.example.demo.service
 * fileName   : StudentSevice
 * author     : HYUCK7
 * date       : 2022-02-07
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-02-07         HYUCK7         최초 생성
 */
public interface MemberSevice {
    String getBmi(BmiDTO bmi);
    String calc(CalcDTO calc);
    String search(GoogleDTO google);
    String getGrade(GradeDTO grade);
    String hello(HelloDTO hello);
    String login(UserDTO login);

}
