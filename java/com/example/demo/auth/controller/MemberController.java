package com.example.demo.auth.controller;

import com.example.demo.auth.domain.*;
import com.example.demo.auth.service.MemberServiceImpl;
import com.example.demo.auth.service.MemberSevice;

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
                BmiDTO b = BmiDTO.getInstance();
                b.setWeight(scanner.nextDouble());
                b.setTall(scanner.nextDouble());
                res = Service.getBmi(b);
                break;
            case "2":
                System.out.println(CalcDTO.CALC_APP + "\n첫 번째 숫자: \n연산기호: \n두 번째 숫자: ");
                CalcDTO c = CalcDTO.getInstance();
                c.setNum1(scanner.nextInt());
                c.setOpcode(scanner.next());
                c.setNum2(scanner.nextInt());
                res = Service.calc(c);
                break;
            case "3":
                System.out.println(GoogleDTO.WEB_LOGO + "\n검색어를 입력하세요 : ");
                GoogleDTO g = GoogleDTO.getInstance();
                g.setUrl(scanner.next());
                res = Service.search(g);
                break;
            case "4":
                System.out.println(GradeDTO.GRADE_MARK + "\n 이름: 국어: 영어: 수학: ");
                GradeDTO r = GradeDTO.getInstance();
                r.setName(scanner.next());
                r.setKor(scanner.nextInt());
                r.setEng(scanner.nextInt());
                r.setMath(scanner.nextInt());
                res = Service.getGrade(r);
                break;
            case "5":
                System.out.println(UserDTO.LOGIN_APP + "\nID: \nPW: \nNAME: ");
                UserDTO u = UserDTO.getInstance();
                u.setID(scanner.next());
                u.setPW(scanner.next());
                u.setName(scanner.next());
                res = Service.login(u);
                break;
            case "6":
                System.out.println(HelloDTO.HELLO_APP + "\nname : \nage: ");
                HelloDTO h = HelloDTO.getInstance();
                h.setName(scanner.next());
                h.setAge(scanner.nextInt());
                res = Service.hello(h);
                break;

            default:
                res = "NO VALUE";
                break;
        }
            System.out.println(res);
        }
    }
}
