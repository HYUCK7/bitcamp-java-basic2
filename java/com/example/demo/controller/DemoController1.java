package com.example.demo.controller;

import com.example.demo.domain.*;
import com.example.demo.service.*;

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
 * 2022-01-27 p        HYUCK7         최초 생성
 */
public class DemoController1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CalcService calcService = new CalcService();
        CalcDTO calc = new CalcDTO();

        BmiService bmiService = new BmiService();
        BmiDTO bmi = new BmiDTO();

        GoogleService googleService = new GoogleService();
        GoogleDTO google = new GoogleDTO();

        GradeService gradeService = new GradeService();
        GradeDTO grade = new GradeDTO();

        LoginService loginService = new LoginService();
        LoginDTO login = new LoginDTO();

        HelloService helloService = new HelloService();
        HelloDTO hello = new HelloDTO();

        while(true){
        System.out.println("메뉴 선택");
        System.out.println("0.EXIT 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN 6.Hello");
        String res = "";
        switch(scanner.next()) {
            case "0":
                System.out.println("EXIT"); return;
            case "1":
                System.out.println(BmiDTO.APP_NAME + "\n몸무게는: \n키는: ");
                bmi.setKg(scanner.nextDouble());
                bmi.setCm(scanner.nextDouble());
                res = bmiService.getBMI(bmi);
                break;
            case "2":
                System.out.println(CalcDTO.CALC_APP + "\n첫 번째 숫자: \n연산기호: \n두 번째 숫자: ");
                calc.setNum1(scanner.nextInt());
                calc.setOpcode(scanner.next());
                calc.setNum2(scanner.nextInt());
                res = calcService.getCalc(calc);
                break;
            case "3":
                System.out.println(GoogleDTO.WEB_LOGO + "\n검색어를 입력하세요 : ");
                google.setUrl(scanner.next());
                res = googleService.getUrl(google);
                break;
            case "4":
                System.out.println(GradeDTO.GRADE_MARK + "\n 이름: 국어: 영어: 수학: ");
                grade.setName(scanner.next());
                grade.setKor(scanner.nextInt());
                grade.setEng(scanner.nextInt());
                grade.setMath(scanner.nextInt());
                res = gradeService.execute(grade);
                break;
            case "5":
                System.out.println(LoginDTO.LOGIN_APP + "\nID: \nPW: \nNAME: ");
                login.setID(scanner.next());
                login.setPW(scanner.next());
                login.setName(scanner.next());
                res = loginService.getLogin(login);
                break;
            case "6":
                System.out.println(HelloDTO.HELLO_APP + "\nname : \nage: ");
                hello.setName(scanner.next());
                hello.setAge(scanner.nextInt());
                res = helloService.execute(hello);
                break;

            default:
                res = "NO VALUE";
                break;
        }
            System.out.println(res);
        }
    }
}
