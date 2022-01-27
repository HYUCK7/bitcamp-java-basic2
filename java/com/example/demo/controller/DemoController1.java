package com.example.demo.controller;

import com.example.demo.bmi.BmiApp1;
import com.example.demo.bmi.BmiDemo1;
import com.example.demo.calc.CalcApp;
import com.example.demo.calc.CalcDemo;
import com.example.demo.google.GoogleApp;
import com.example.demo.google.GoogleDemo;
import com.example.demo.grade.GradeApp;
import com.example.demo.login.LoginApp;
import com.example.demo.login.LoginDemo;

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
        BmiDemo1 bmiDemo1 = new BmiDemo1();
        GoogleDemo googleDemo = new GoogleDemo();
        GradeApp gradeApp = new GradeApp();
        LoginDemo loginDemo = new LoginDemo();

        while(true){
        System.out.println("메뉴 선택");
        System.out.println("0.EXIT 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN");
        String select = scanner.next();
        String res = "";
        switch(select) {
            case "0":
                System.out.println("EXIT"); return;
            case "1":
                System.out.println(BmiApp1.APP_NAME + "\n몸무게는: \n키는: ");
                res = bmiDemo1.execute(scanner.nextDouble(), scanner.nextDouble());
                break;
            case "2":
                System.out.println(CalcApp.CALC_APP + "\n첫 번째 숫자: \n연산기호: \n두 번째 숫자: ");
                res = calcDemo.execute(scanner.nextInt(), scanner.next(), scanner.nextInt());
                break;
            case "3":
                System.out.println(GoogleApp.WEB_LOGO + "\n검색어를 입력하세요 : ");
                res = googleDemo.execute(scanner.next());
                break;
            case "4":
                res = "4.GRADE";
                break;
            case "5":
                System.out.println(LoginApp.LOGIN_APP + "\nID: \nPW: \nNAME: ");
                res = loginDemo.execute(scanner.next(), scanner.next(), scanner.next());
                break;
            default:
                res = "NO VALUE";
                break;
        }
            System.out.println(res);
        }
    }
}
