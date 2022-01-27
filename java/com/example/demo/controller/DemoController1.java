package com.example.demo.controller;

import com.example.demo.calc.CalcDemo;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName   : DemoController1
 * author     : HYUCK7
 * date       : 2022-01-27
 * desc       :
 * ================================
 * DATE            AUTHOR         NOTE
 * ================================
 * 2022-01-27         HYUCK7         최초 생성
 */
public class DemoController1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcDemo calcDemo = new CalcDemo();
        while(true){
        System.out.println("메뉴 선택");
        System.out.println("0.EXIT 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN");
        String select = scanner.next();
        String res = "";
        switch(select) {
            case "0":
                System.out.println("EXIT"); return;
            case "1":
                res = "1.BMI";
                break;
            case "2":
                res = "2.CALC";
                calcDemo.execute();
                res = "2.CALC";
                break;
            case "3":
                res = "3.SEARCH";
                break;
            case "4":
                res = "4.GRADE";
                break;
            case "5":
                res = "5.LOGIN";
                break;
            default:
                res = "NO VALUE";
                break;
        }
            System.out.println(res);
        }
    }
}
