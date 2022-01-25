package com.example.demo.calc;
/**
 * packageName: com.example.calc
 * fileName   : CalcApp.java
 * author     : HYUCK7
 * date       : 2022-01-24
 * desc       : 숫자 2개와 연산자를 받아 리턴하는 앱
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-24         HYUCK7        최초 생성
 */
public class CalcApp {
        int num1;
        String opcode;
        int num2;
        static String CALC_APP ="   <<<Calc.com>>>  ";

        public String calc(int num1, String opcode, int num2) {
            this. num1 = num1;
            this. opcode = opcode;
            this. num2 = num2;
            int res = 0;
            if(opcode.equals("+")){
                res = num1 + num2;
            }else if(opcode.equals("-")){
                res = num1 - num2;
            }else if(opcode.equals("*")){
                res = num1 * num2;
            }else if(opcode.equals("/")){
                res = num1 / num2;
            }

            return String.format( "%d %s %d = %d", this.num1, this.opcode, this.num2, res );
        }

}
