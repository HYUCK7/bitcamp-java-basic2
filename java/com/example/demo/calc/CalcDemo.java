package com.example.demo.calc;
/**
 * packageName: com.example.calc
 * fileName   : CalcDemo.java
 * author     : HYUCK7
 * date       : 2022-01-24
 * desc       : 계산기 앱을 실행하는 컨트롤러
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-24         HYUCK7        최초 생성
 * 2022-01-26         HYUCK7        if절 추가 및 4칙 연산 가능하도록 개선
 */

import java.util.Scanner;

public class CalcDemo {
    public String execute(int num1, String opcode, int num2) {
        CalcApp calcApp = new CalcApp();
        return calcApp.calc(num1, opcode, num2);
    }
}
