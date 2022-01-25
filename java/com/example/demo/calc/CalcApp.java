package com.example.demo.calc;
/**
 *  숫자 2개와 연산자 1개를 받아서, 계산하는 계산기를 코딩하시오.
 *  int, String
 * */
public class CalcApp {
        int num1;
        String opcode;
        int num2;
        static String CALC_APP ="   <<<Calc.com>>>  ";

        public String calc(int num1, String opcode, int num2) {
            this. num1 = num1;
            this. opcode = opcode;
            this. num2 = num2;
            return String.format( "%d %s %d = %d", this.num1, this.opcode, this.num2, num1 + num2 );
        }

}
