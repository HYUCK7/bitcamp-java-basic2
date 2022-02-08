package com.example.demo.member.controller;

import com.example.demo.member.domain.*;
import com.example.demo.member.service.MemberServiceImpl;
import com.example.demo.member.service.MemberSevice;

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
public class MemberController {
    public void execute (Scanner scanner) {
        CalcDTO calc = new CalcDTO();
        BmiDTO bmi = new BmiDTO();
        GoogleDTO google = new GoogleDTO();
        GradeDTO grade = new GradeDTO();
        LoginDTO login = new LoginDTO();
        HelloDTO hello = new HelloDTO();
        MemberSevice Service = new MemberServiceImpl();

        while(true){
        System.out.println("메뉴 선택");
        System.out.println("0.EXIT 1.BMI 2.CALC 3.SEARCH 4.GRADE 5.LOGIN 6.Hello");
        String res = "";
        switch(scanner.next()) {
            case "0":
                System.out.println("EXIT"); return;
            case "1":
                System.out.println(BmiDTO.APP_NAME + "\n몸무게는: \n키는: ");
                bmi.setWeight(scanner.nextDouble());
                bmi.setTall(scanner.nextDouble());
                res = Service.getBmi(bmi);
                break;
            case "2":
                System.out.println(CalcDTO.CALC_APP + "\n첫 번째 숫자: \n연산기호: \n두 번째 숫자: ");
                calc.setNum1(scanner.nextInt());
                calc.setOpcode(scanner.next());
                calc.setNum2(scanner.nextInt());
                res = Service.calc(calc);
                break;
            case "3":
                System.out.println(GoogleDTO.WEB_LOGO + "\n검색어를 입력하세요 : ");
                google.setUrl(scanner.next());
                res = Service.search(google);
                break;
            case "4":
                System.out.println(GradeDTO.GRADE_MARK + "\n 이름: 국어: 영어: 수학: ");
                grade.setName(scanner.next());
                grade.setKor(scanner.nextInt());
                grade.setEng(scanner.nextInt());
                grade.setMath(scanner.nextInt());
                res = Service.getGrade(grade);
                break;
            case "5":
                System.out.println(LoginDTO.LOGIN_APP + "\nID: \nPW: \nNAME: ");
                login.setID(scanner.next());
                login.setPW(scanner.next());
                login.setName(scanner.next());
                res = Service.login(login);
                break;
            case "6":
                System.out.println(HelloDTO.HELLO_APP + "\nname : \nage: ");
                hello.setName(scanner.next());
                hello.setAge(scanner.nextInt());
                res = Service.hello(hello);
                break;

            default:
                res = "NO VALUE";
                break;
        }
            System.out.println(res);
        }
    }
}
