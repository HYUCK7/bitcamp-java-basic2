package com.example.demo.member.domain;
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
 * * 2022-01-26       HYUCK7        if절 추가 및 4칙 연산 가능하도록 개선
 */
public class CalcDTO {
        private int num1;
        private String opcode;
        private int num2;
        public static String CALC_APP ="   <<<Calc.com>>>  ";

        public int getNum1(){
            return num1;
        }
        public void setNum1(int num1){
            this.num1 = num1;
        }
        public String getOpcode(){
            return opcode;
        }
        public void setOpcode(String opcode){
            this.opcode = opcode;
        }
        public int getNum2(){
            return num2;
        }
        public void setNum2(int num2){
            this.num2 = num2;
        }


}
