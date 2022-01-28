package com.example.demo.service;

import com.example.demo.domain.CalcDTO;

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

public class CalcService {
    public String getCalc(CalcDTO calc) {
        int res = 0;
        switch(calc.getOpcode()){
            case "+": res = calc.getNum1() + calc.getNum2(); break;
            case "-": res = calc.getNum1() - calc.getNum2(); break;
            case "*": res = calc.getNum1() * calc.getNum2(); break;
            case "/": res = calc.getNum1() / calc.getNum2(); break;
        }
        return String.format( "%d %s %d = %d", calc.getNum1(), calc.getOpcode(), calc.getNum2(), res );
    }
}

