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
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        CalcApp calcApp = new CalcApp();

        System.out.println("첫 번째 숫자: ");
        int num1 = scanner.nextInt();

        System.out.println("연산기호: + - * /");
        String opcode = scanner.next();

        System.out.println("두 번째 숫자: ");
        int num2 = scanner.nextInt();

        String result = calcApp.calc(num1, opcode, num2);
        System.out.println(result);
    }
}
